package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class UpdateDeliveryStatusConroller {

    @FXML
    private TableColumn<UpdateDeliveryStatus, String> departmentCol;

    @FXML
    private TableColumn<UpdateDeliveryStatus, String> statusCol;

    @FXML
    private ComboBox<String> statusCB;

    @FXML
    private TableColumn<UpdateDeliveryStatus, Integer> imtesCol;

    @FXML
    private Label updateDeliverStatusL;

    @FXML
    private TableView<UpdateDeliveryStatus> deliveryStatusTV;

    @FXML
    private TextArea addNoteTA;

    private final ObservableList<UpdateDeliveryStatus> deliveryList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        departmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        imtesCol.setCellValueFactory(new PropertyValueFactory<>("items"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        deliveryList.addAll(
                new UpdateDeliveryStatus("DEL001", "Housekeeping", 50, "Pending", ""),
                new UpdateDeliveryStatus("DEL002", "Kitchen", 30, "En Route", ""),
                new UpdateDeliveryStatus("DEL003", "Laundry", 20, "Pending", "")
        );

        deliveryStatusTV.setItems(deliveryList);

        statusCB.setItems(FXCollections.observableArrayList("Pending", "En Route", "Delivered", "Failed"));
    }

    @FXML
    public void returnToDashboardOA(ActionEvent actionEvent) {
        Stage stage = (Stage) deliveryStatusTV.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void updateStatusOA(ActionEvent actionEvent) {
        UpdateDeliveryStatus selected = deliveryStatusTV.getSelectionModel().getSelectedItem();
        if (selected == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("No Delivery Selected");
            alert.setHeaderText(null);
            alert.setContentText("Please select a delivery from the table first.");
            alert.showAndWait();
            return;
        }

        String newStatus = statusCB.getValue();
        String note = addNoteTA.getText();

        if (newStatus == null || newStatus.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("No Status Selected");
            alert.setHeaderText(null);
            alert.setContentText("Please select a status from the dropdown.");
            alert.showAndWait();
            return;
        }
        selected.setStatus(newStatus);
        selected.setNotes(note);
        deliveryStatusTV.refresh();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Status Updated");
        alert.setHeaderText(null);
        alert.setContentText("Delivery status has been updated successfully.");
        alert.showAndWait();

        deliveryStatusTV.getSelectionModel().clearSelection();
        addNoteTA.clear();
        statusCB.getSelectionModel().clearSelection();
    }
}
