package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.LocalTime;

public class ScheduleDeliveriesController {

    @FXML
    private Label newSupplyRequests;

    @FXML
    private TableView<ScheduleDeliveries> requestTableView;

    @FXML
    private TableColumn<ScheduleDeliveries, String> requestIdCol;

    @FXML
    private TableColumn<ScheduleDeliveries, String> departmentNameTF;

    @FXML
    private TableColumn<ScheduleDeliveries, String> itemsandQuantityTF;

    @FXML
    private TableColumn<ScheduleDeliveries, LocalDate> deliveryDeadlineCol;

    @FXML
    private TableColumn<ScheduleDeliveries, String> ActionCol;

    @FXML
    private Label optionalNoteL;

    private final ObservableList<ScheduleDeliveries> deliveriesList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        requestIdCol.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        departmentNameTF.setCellValueFactory(new PropertyValueFactory<>("deliveryPersonnel"));
        itemsandQuantityTF.setCellValueFactory(new PropertyValueFactory<>("itemChecklist"));
        deliveryDeadlineCol.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));
        ActionCol.setCellValueFactory(new PropertyValueFactory<>("deliveryVehicle"));

        loadConfirmedRequests();

        requestTableView.setItems(deliveriesList);
    }

    private void loadConfirmedRequests() {

        deliveriesList.add(new ScheduleDeliveries("REQ001", LocalDate.now().plusDays(1), LocalTime.of(10, 0), "Van-1", "Housekeeping", "Towels-50, Soap-20"));
        deliveriesList.add(new ScheduleDeliveries("REQ002", LocalDate.now().plusDays(2), LocalTime.of(14, 30), "Truck-2", "Kitchen", "Vegetables-30kg, Milk-20L"));
    }

    @FXML
    void viewOA(ActionEvent event) {
        ScheduleDeliveries selected = requestTableView.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showAlert("Selection Required", "Please select a delivery request to view.");
            return;
        }
        optionalNoteL.setText(selected.getItemChecklist());
    }

    @FXML
    void returnToDashboardOA(ActionEvent event) {

        Stage stage = (Stage) requestTableView.getScene().getWindow();
        stage.close();

    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
