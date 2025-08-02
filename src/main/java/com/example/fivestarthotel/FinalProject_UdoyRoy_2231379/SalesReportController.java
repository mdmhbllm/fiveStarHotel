package com.example.fivestarthotel.FinalProject_UdoyRoy_2231379;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class SalesReportController
{
    @javafx.fxml.FXML
    private Label totalSalesLabel;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Sales,Double> amountCol;
    @javafx.fxml.FXML
    private Label mostSoldItemLabel;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> cateGoryCombo;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<Sales,String> itemCol;
    @javafx.fxml.FXML
    private TableColumn<Sales,String> paymentMethodCol;
    @javafx.fxml.FXML
    private TableColumn<Sales, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableView<Sales> salesReportTableView;
    @javafx.fxml.FXML
    private TableColumn<Sales,String> oderidCol;
    @javafx.fxml.FXML
    private Label totalOdersLabel;

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
    public void backToDashBoradOnAction(ActionEvent actionEvent) {
    }
}