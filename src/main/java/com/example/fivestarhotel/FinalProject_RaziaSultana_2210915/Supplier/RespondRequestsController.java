package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.time.LocalDate;

public class RespondRequestsController {

    @FXML
    private Label newSupplyRequestL;

    @FXML
    private TableView<RespondRequests> requestTableView;

    @FXML
    private TableColumn<RespondRequests, String> departmentCol;

    @FXML
    private TableColumn<RespondRequests, String> itemsCol;

    @FXML
    private TableColumn<RespondRequests, LocalDate> deadlineCol;

    @FXML
    private TableColumn<RespondRequests, String> ActionCol;

    @FXML
    private TextField departmentNameTF;

    @FXML
    private TextField itemsandQuantityTF;

    @FXML
    private DatePicker deliveryDateDP;

    @FXML
    private TextArea noteTA;

    private final ObservableList<RespondRequests> requestsList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        departmentCol.setCellValueFactory(new PropertyValueFactory<>("departmentName"));
        itemsCol.setCellValueFactory(new PropertyValueFactory<>("itemsAndQuantity"));
        deadlineCol.setCellValueFactory(new PropertyValueFactory<>("deliveryDeadline"));
        ActionCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        loadRequests();
    }

    private void loadRequests() {
        requestsList.add(new RespondRequests("Housekeeping", "Towels-50, Soaps-20", LocalDate.now().plusDays(2), "", "Pending"));
        requestsList.add(new RespondRequests("Kitchen", "Vegetables-30kg, Milk-20L", LocalDate.now().plusDays(1), "", "Pending"));

        requestTableView.setItems(requestsList);
    }

    @FXML
    void acceptOrDeclineOA(ActionEvent event) {
        RespondRequests selectedRequest = requestTableView.getSelectionModel().getSelectedItem();
        if (selectedRequest == null) {
            showAlert("No Selection", "Please select a request to respond.");
            return;
        }

        String note = noteTA.getText();
        LocalDate deliveryDate = deliveryDateDP.getValue();

        if (deliveryDate != null) {
            selectedRequest.setDeliveryDeadline(deliveryDate);
        }
        if (!note.isEmpty()) {
            selectedRequest.setNotes(note);
        }

        ChoiceDialog<String> dialog = new ChoiceDialog<>("Accept", "Accept", "Decline");
        dialog.setTitle("Respond to Request");
        dialog.setHeaderText("Choose action for selected request");
        dialog.setContentText("Action:");

        dialog.showAndWait().ifPresent(action -> {
            selectedRequest.setStatus(action);
            requestTableView.refresh();
            showAlert("Request Updated", "Request status updated to: " + action);
        });
    }

    @FXML
    void returnToDashboardOA(ActionEvent event) {

        Stage stage = (Stage) requestTableView.getScene().getWindow();
        stage.close();
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
