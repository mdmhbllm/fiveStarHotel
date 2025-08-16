package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class SuperviseOperationsController {

    @FXML
    private TableColumn<OperationData, String> departmentNameCol;
    @FXML
    private TableColumn<OperationData, String> statusCool;
    @FXML
    private TableColumn<OperationData, String> staffOnDudtyCol;
    @FXML
    private TableColumn<OperationData, String> pendingIssuesCol;
    @FXML
    private TableView<OperationData> operationsTV;
    @FXML
    private DatePicker datePK;
    @FXML
    private ComboBox<String> operationStatusCB;
    @FXML
    private ComboBox<String> departmentCB;
    @FXML
    private Label superviseOperationsL;

    private ObservableList<OperationData> masterData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        departmentNameCol.setCellValueFactory(cellData -> cellData.getValue().departmentNameProperty());
        statusCool.setCellValueFactory(cellData -> cellData.getValue().statusProperty());
        staffOnDudtyCol.setCellValueFactory(cellData -> cellData.getValue().staffOnDutyProperty());
        pendingIssuesCol.setCellValueFactory(cellData -> cellData.getValue().pendingIssuesProperty());

        departmentCB.setItems(FXCollections.observableArrayList(
                "All Departments", "Housekeeping", "Front Desk", "Food & Beverage", "Maintenance"
        ));
        departmentCB.getSelectionModel().selectFirst();

        operationStatusCB.setItems(FXCollections.observableArrayList(
                "All Status", "Active", "Delayed", "Completed"
        ));
        operationStatusCB.getSelectionModel().selectFirst();

        masterData.addAll(
                new OperationData("Housekeeping", "Active", "5", "2 rooms pending"),
                new OperationData("Front Desk", "Completed", "3", "No issues"),
                new OperationData("Food & Beverage", "Delayed", "8", "Kitchen equipment issue"),
                new OperationData("Maintenance", "Active", "2", "Pool pump repair")
        );

        operationsTV.setItems(masterData);
    }

    @FXML
    public void viewOA(ActionEvent actionEvent) {
        String selectedDept = departmentCB.getValue();
        String selectedStatus = operationStatusCB.getValue();
        LocalDate selectedDate = datePK.getValue(); // For real DB, use to filter by date

        ObservableList<OperationData> filteredList = masterData.stream()
                .filter(data -> (selectedDept.equals("All Departments") || data.getDepartmentName().equals(selectedDept)))
                .filter(data -> (selectedStatus.equals("All Status") || data.getStatus().equals(selectedStatus)))
                .collect(Collectors.toCollection(FXCollections::observableArrayList));

        operationsTV.setItems(filteredList);
    }

    @FXML
    public void logOutOA(ActionEvent actionEvent) {
        System.out.println("Logging out... Returning to login screen.");

    }

    @FXML
    public void backOA(ActionEvent actionEvent) {
        System.out.println("Going back to General Manager dashboard...");
    }

    public static class OperationData {
        private final javafx.beans.property.SimpleStringProperty departmentName;
        private final javafx.beans.property.SimpleStringProperty status;
        private final javafx.beans.property.SimpleStringProperty staffOnDuty;
        private final javafx.beans.property.SimpleStringProperty pendingIssues;

        public OperationData(String departmentName, String status, String staffOnDuty, String pendingIssues) {
            this.departmentName = new javafx.beans.property.SimpleStringProperty(departmentName);
            this.status = new javafx.beans.property.SimpleStringProperty(status);
            this.staffOnDuty = new javafx.beans.property.SimpleStringProperty(staffOnDuty);
            this.pendingIssues = new javafx.beans.property.SimpleStringProperty(pendingIssues);
        }

        public String getDepartmentName() { return departmentName.get(); }
        public javafx.beans.property.StringProperty departmentNameProperty() { return departmentName; }

        public String getStatus() { return status.get(); }
        public javafx.beans.property.StringProperty statusProperty() { return status; }

        public String getStaffOnDuty() { return staffOnDuty.get(); }
        public javafx.beans.property.StringProperty staffOnDutyProperty() { return staffOnDuty; }

        public String getPendingIssues() { return pendingIssues.get(); }
        public javafx.beans.property.StringProperty pendingIssuesProperty() { return pendingIssues; }
    }
}
