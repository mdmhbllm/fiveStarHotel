package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class TurnoverRepotController
{
    @javafx.fxml.FXML
    private DatePicker fromDate;
    @javafx.fxml.FXML
    private TableColumn<Employee,Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> departmentCol;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> reasonCol;
    @javafx.fxml.FXML
    private DatePicker toDate;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> nameCol;
    @javafx.fxml.FXML
    private ComboBox<String> departmentCombo;
    @javafx.fxml.FXML
    private TableView<Employee> tableView;
    @javafx.fxml.FXML
    private TableColumn<Employee, LocalDate> leftDateCol;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backtoDashboradOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportToPdf(ActionEvent actionEvent) {
    }
}