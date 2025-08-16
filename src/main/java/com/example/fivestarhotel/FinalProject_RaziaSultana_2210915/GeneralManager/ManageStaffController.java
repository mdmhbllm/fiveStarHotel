package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageStaffController
{
    @FXML
    private TableColumn<ManageStaff, String> shifttimeCol;
    @FXML
    private TableColumn<ManageStaff, String> departmentCol;
    @FXML
    private TableColumn<ManageStaff, String> availabilityCool;
    @FXML
    private TableView<ManageStaff> staffTV;
    @FXML
    private TableColumn<ManageStaff, String> nameCol;
    @FXML
    private Label manageStaffL;
    @FXML
    private TableColumn<ManageStaff, Number> staffIdCol;
    @FXML
    private TableColumn<ManageStaff, Number> performanceRatingCol;
    @FXML
    private TextField staffIdTF;
    @FXML
    private ComboBox<String> departmentNameCB;

    private final ObservableList<ManageStaff> staffList = FXCollections.observableArrayList();
    private final ObservableList<ManageStaff> filteredList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        staffIdCol.setCellValueFactory(data -> new javafx.beans.property.SimpleIntegerProperty(data.getValue().getStaffId()));
        nameCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getStaffName()));
        departmentCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getDepartment()));
        shifttimeCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getShiftTime()));
        availabilityCool.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getAvailability()));
        performanceRatingCol.setCellValueFactory(data -> new javafx.beans.property.SimpleDoubleProperty(data.getValue().getPerformanceRating()));

        staffList.addAll(
                new ManageStaff(101, "John Doe", "Housekeeping", "Morning", "On Duty", 4.5),
                new ManageStaff(102, "Jane Smith", "Reception", "Evening", "Off Duty", 4.0),
                new ManageStaff(103, "Mike Johnson", "Security", "Night", "On Duty", 3.8),
                new ManageStaff(104, "Emily Davis", "Housekeeping", "Morning", "Leave", 4.2),
                new ManageStaff(105, "Robert Brown", "Maintenance", "Evening", "On Duty", 3.5)
        );

        departmentNameCB.setItems(FXCollections.observableArrayList(
                "All Departments",
                "Housekeeping",
                "Reception",
                "Security",
                "Maintenance"
        ));
        departmentNameCB.setValue("All Departments");

        staffTV.setItems(staffList);

        departmentNameCB.setOnAction(e -> filterStaff());
        staffIdTF.textProperty().addListener((obs, oldVal, newVal) -> filterStaff());
    }

    private void filterStaff() {
        String selectedDept = departmentNameCB.getValue();
        String staffIdText = staffIdTF.getText();

        filteredList.clear();

        for (ManageStaff staff : staffList) {
            boolean matchesDept = (selectedDept == null || selectedDept.equals("All Departments") || staff.getDepartment().equals(selectedDept));
            boolean matchesId = (staffIdText == null || staffIdText.isEmpty() || String.valueOf(staff.getStaffId()).equals(staffIdText));

            if (matchesDept && matchesId) {
                filteredList.add(staff);
            }
        }

        staffTV.setItems(filteredList.isEmpty() ? staffList : filteredList);
    }

    @FXML
    public void evaluateOA(ActionEvent actionEvent) {
        ManageStaff selected = staffTV.getSelectionModel().getSelectedItem();
        if (selected == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Please select a staff member to evaluate.");
            alert.showAndWait();
            return;
        }

        String evaluationReport =
                "Staff ID: " + selected.getStaffId() + "\n" +
                        "Name: " + selected.getStaffName() + "\n" +
                        "Department: " + selected.getDepartment() + "\n" +
                        "Shift Time: " + selected.getShiftTime() + "\n" +
                        "Availability: " + selected.getAvailability() + "\n" +
                        "Performance Rating: " + selected.getPerformanceRating() + "\n\n" +
                        "Attendance logs: Present 95% of shifts\n" +
                        "Shift history: Stable shift pattern\n" +
                        "Notes: Good teamwork and punctuality.";

        Alert alert = new Alert(Alert.AlertType.INFORMATION, evaluationReport);
        alert.setHeaderText("Staff Evaluation");
        alert.showAndWait();
    }

    @FXML
    public void backOA(ActionEvent actionEvent) {
        System.out.println("Returning to previous menu...");
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Returning to previous menu.");
        alert.showAndWait();
    }

    @FXML
    public void logOutOA(ActionEvent actionEvent) {
        System.out.println("Logging out...");
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Logged out. Returning to login screen.");
        alert.showAndWait();
    }
}
