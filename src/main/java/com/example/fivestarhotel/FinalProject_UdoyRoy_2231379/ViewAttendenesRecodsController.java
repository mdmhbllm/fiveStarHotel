package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ViewAttendenesRecodsController
{
    @javafx.fxml.FXML
    private TableColumn<Attendance,LocalTime> inCol;
    @javafx.fxml.FXML
    private TableColumn<Attendance, LocalTime> outCol;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Attendance,String> departmentCol;
    @javafx.fxml.FXML
    private TextField staffIdTextField;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Attendance,Integer> staffIdCol;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<Attendance, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<Attendance,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<Attendance,String> nameCol;
    @javafx.fxml.FXML
    private ComboBox<String> dpartmentCombo;
    @javafx.fxml.FXML
    private TableView<Attendance> attendencestableView;


ArrayList<Attendance> attendanceList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        dpartmentCombo.getItems().addAll("Front Office","Supplier","HouseKeeping","Restarant Manager","Finance & Accounting","Engineering & Maintenance");


        nameCol.setCellValueFactory(new PropertyValueFactory<>("staffName"));
        staffIdCol.setCellValueFactory(new PropertyValueFactory<>("staffID"));
        departmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        inCol.setCellValueFactory(new PropertyValueFactory<>("checkInTime"));
        outCol.setCellValueFactory(new PropertyValueFactory<>("checkOutTime"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));






    }
    @javafx.fxml.FXML
    public void resetOnAction(ActionEvent actionEvent) {
        fromDatePicker.setValue(null);
        toDatePicker.setValue(null);
        dpartmentCombo.setValue(null);
        staffIdTextField.clear();
    }

    @javafx.fxml.FXML
    public void applyFilterOnAction(ActionEvent actionEvent) {
LocalDate fromDate = fromDatePicker.getValue();
LocalDate toDate = toDatePicker.getValue();
String staffName = staffIdTextField.getText();
String Department = dpartmentCombo.getValue();

        ArrayList<Attendance> filteredList = new ArrayList<>();


        for (Attendance a : attendanceList) {
            boolean matches = true;


            if (fromDate != null && a.getDate().isBefore(fromDate)) {
                matches = false;
            }
            if (toDate != null && a.getDate().isAfter(toDate)) {
                matches = false;
            }


            if (Department != null && !Department.equals("All") && !a.getDepartment().equalsIgnoreCase(Department)) {
                matches = false;
            }

            if (!staffName.isEmpty()) {
                try {
                    int staffId = Integer.parseInt(staffName);
                    if (a.getStaffID() != staffId) {
                        matches = false;
                    }
                } catch (NumberFormatException e) {
                    matches = false;
                }
            }

            if (matches) {
                filteredList.add(a);
            }
        }

        attendencestableView.getItems().clear();
        attendencestableView.getItems().addAll(filteredList);

        // Show message
        if (filteredList.isEmpty()) {
            messageLabel.setText("No records found!");
        } else {
            messageLabel.setText("Found " + filteredList.size() + " record(s).");
        }





    }

    @javafx.fxml.FXML
    public void backToDashboradOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("dashboradForUser6HRManager.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }


    @javafx.fxml.FXML
    public void viewAttendensOnaction(ActionEvent actionEvent) {
        if (attendanceList.isEmpty()) {
            attendanceList.add(new Attendance("Ayan", 101, "HouseKeeping",
                    LocalDate.of(2025, 8, 15), LocalTime.of(9, 0), LocalTime.of(17, 0), "Present"));
            attendanceList.add(new Attendance("Nabil", 102, "engineering",
                    LocalDate.of(2025, 8, 15), LocalTime.of(9, 30), LocalTime.of(17, 30), "Present"));
            attendanceList.add(new Attendance("Rafi", 203, "Front Office",
                    LocalDate.of(2025, 8, 15), LocalTime.of(10, 0), LocalTime.of(18, 0), "Late"));
            attendanceList.add(new Attendance("Joy", 104, "Restaurant Manager",
                    LocalDate.of(2025, 8, 15), LocalTime.of(9, 0), LocalTime.of(16, 30), "Present"));
            attendanceList.add(new Attendance("Sourav", 303, "Finance & Accounting",
                    LocalDate.of(2025, 8, 15), LocalTime.of(9, 0), LocalTime.of(17, 0), "Absent"));
        }
    attendencestableView.getItems().clear();
        attendencestableView.getItems().addAll(attendanceList);
    }
}