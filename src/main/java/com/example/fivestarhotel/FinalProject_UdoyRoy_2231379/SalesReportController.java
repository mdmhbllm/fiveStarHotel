package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;


public class SalesReportController
{
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn<SalesReport,Double> amountCol;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> cateGoryCombo;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<SalesReport,String> itemCol;
    @javafx.fxml.FXML
    private TableColumn<SalesReport,String> paymentMethodCol;
    @javafx.fxml.FXML
    private TableColumn<SalesReport, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableView<SalesReport> salesReportTableView;
    @javafx.fxml.FXML
    private TableColumn<SalesReport,String> oderidCol;


    ArrayList<SalesReport> salesReports = new ArrayList<>();



    @javafx.fxml.FXML
    public void initialize() {
        cateGoryCombo.getItems().addAll("All");


        oderidCol.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
        itemCol.setCellValueFactory(new PropertyValueFactory<>("itemSold"));
        paymentMethodCol.setCellValueFactory(new PropertyValueFactory<>("paymentMethod"));



        salesReports.add(new SalesReport("R001", LocalDate.of(2025, 8, 1), null, 150.75f, "Grilled Chicken", "Card",null));
        salesReports.add(new SalesReport("R002", LocalDate.of(2025, 8, 2), null, 45.50f, "Lemonade", "Cash",null));
        salesReports.add(new SalesReport("R003", LocalDate.of(2025, 8, 3), null, 30.25f, "Chocolate Cake", "Card",null));
        salesReports.add(new SalesReport("R004", LocalDate.of(2025, 8, 4), null, 200.00f, "Steak", "mobile banking",null));
        salesReports.add(new SalesReport("R005", LocalDate.of(2025, 8, 5), null, 60.00f, "Caesar Salad", "Card",null));
        salesReports.add(new SalesReport("R006", LocalDate.of(2025, 8, 6), null, 35.00f, "Iced Tea", "cash",null));
        salesReports.add(new SalesReport("R007", LocalDate.of(2025, 8, 7), null, 180.50f, "Pasta Carbonara", "Cash",null));


        salesReportTableView.getItems().addAll(salesReports);

    }

    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
        fromDatePicker.setValue(null);
        toDatePicker.setValue(null);
        cateGoryCombo.setValue(null);
        messageLabel.setText("");
        salesReportTableView.getItems().clear();


    }

    @javafx.fxml.FXML
    public void generateReportOnAction(ActionEvent actionEvent) {
        LocalDate from = fromDatePicker.getValue();
        LocalDate to = toDatePicker.getValue();
        String category = cateGoryCombo.getValue();

        if (from == null) {
            messageLabel.setText("Please select a 'From' date.");
            return;
        }
        if (to == null) {
            messageLabel.setText("Please select a 'To' date.");
            return;
        }
        if (from.isAfter(to)) {
            messageLabel.setText("'From' date cannot be after 'To' date.");
            return;
        }


        List<SalesReport> filtered = new ArrayList<>();
        for (SalesReport s : salesReports) {
            boolean inDateRange = !s.getStartDate().isBefore(from) && !s.getStartDate().isAfter(to);
            boolean categoryMatch = category.equals("All") || s.getCategory().equalsIgnoreCase(category);

            if (inDateRange && categoryMatch) {
                filtered.add(s);
            }
        }

        if (filtered.isEmpty()) {
            messageLabel.setText("No sales data for selected period/category.");
        } else {
            messageLabel.setText("Report generated successfully.");
        }

        salesReportTableView.getItems().setAll(filtered);
    }

    @javafx.fxml.FXML
    public void backToDashBoradOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("restaurentManager.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }


}