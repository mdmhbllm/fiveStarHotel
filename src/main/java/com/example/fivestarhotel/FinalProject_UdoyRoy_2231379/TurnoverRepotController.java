package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


public class TurnoverRepotController {
    @javafx.fxml.FXML
    private DatePicker fromDate;
    @javafx.fxml.FXML
    private TableColumn<Employee, Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> departmentCol;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> reasonCol;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> nameCol;
    @javafx.fxml.FXML
    private ComboBox<String> departmentCombo;
    @javafx.fxml.FXML
    private TableView<Employee> tableView;
    @javafx.fxml.FXML
    private TableColumn<Employee, LocalDate> leftDateCol;
    @javafx.fxml.FXML
    private Label messageLabel;


    ArrayList<Employee> employeeList = new ArrayList<>();


    public void initialize() {
        departmentCombo.getItems().addAll("Front Office", "Supplier", "HouseKeeping", "Restaurant Manager",
                "Finance & Accounting", "Engineering & Maintenance");
        idCol.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        departmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        leftDateCol.setCellValueFactory(new PropertyValueFactory<>("terminationDate"));
        reasonCol.setCellValueFactory(new PropertyValueFactory<>("terminationReason"));


    }


    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void backtoDashboradOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("dashboradForUser6HRManager.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }


    @javafx.fxml.FXML
    public void generateReportOnAction(ActionEvent actionEvent) {
        String selectedDept = departmentCombo.getValue();
        LocalDate selectedDate = fromDate.getValue();


        ArrayList<Employee> filteredList = new ArrayList<>();


        for (Employee emp : employeeList) {
            boolean keepEmployee = true;


            if (selectedDept != null && !emp.getDepartment().equals(selectedDept)) {
                keepEmployee = false;
            }


            if (selectedDate != null && emp.getTerminationDate().isBefore(selectedDate)) {
                keepEmployee = false;
            }


            if (keepEmployee) {
                filteredList.add(emp);
            }
        }


        tableView.getItems().setAll(filteredList);


        messageLabel.setText("Showing " + filteredList.size() + " of " + employeeList.size() + " employees");


    }

    @javafx.fxml.FXML
    public void viewDateOnAction(ActionEvent actionEvent) {
        if (employeeList.isEmpty()) {
            employeeList.addAll(Arrays.asList(
                    new Employee("103", "rony", "Kitchen", null, null, null, null, LocalDate.now().minusDays(2), "Better offer"),
                    new Employee("102", "Tanvir", "Restaurant", null, null, null, null, LocalDate.now().minusDays(5), "Performance"),
                    new Employee("103", "Ayan", "HouseKeeping", null, null, null, null, LocalDate.now().minusDays(7), "Policy violation"),
                    new Employee("104", "Joy", "Front Office", null, null, null, null, LocalDate.now().minusDays(10), "Contract ended"),
                    new Employee("105", "Sara", "Finance & Accounting", null, null, null, null, LocalDate.now().minusDays(12), "Better offer")
            ));

tableView.getItems().setAll(employeeList);
        }

    }
}