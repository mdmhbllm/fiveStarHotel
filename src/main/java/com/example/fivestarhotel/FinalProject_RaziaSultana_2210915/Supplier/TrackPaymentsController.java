package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class TrackPaymentsController {

    @FXML
    private TableColumn<TrackPayments, Integer> itemsSuplierCol;

    @FXML
    private TableColumn<TrackPayments, String> deliveryIdCol;

    @FXML
    private TableColumn<TrackPayments, Double> amountCol;

    @FXML
    private Label trackPaymentL;

    @FXML
    private TableColumn<TrackPayments, String> paymentCol;

    @FXML
    private DatePicker dateDP;

    @FXML
    private ComboBox<String> departmentFilterCB;

    @FXML
    private ComboBox<String> paymentStatusCB;

    @FXML
    private TableView<TrackPayments> paymentTV;

    private final ObservableList<TrackPayments> paymentList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        deliveryIdCol.setCellValueFactory(new PropertyValueFactory<>("deliveryId"));
        itemsSuplierCol.setCellValueFactory(new PropertyValueFactory<>("itemsSupplied"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        paymentCol.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));

        paymentList.addAll(
                new TrackPayments("DEL001", 50, 250.0, "Pending", LocalDate.now().minusDays(2), "Housekeeping"),
                new TrackPayments("DEL002", 30, 180.0, "Paid", LocalDate.now().minusDays(1), "Kitchen"),
                new TrackPayments("DEL003", 20, 120.0, "Pending", LocalDate.now(), "Laundry")
        );

        paymentTV.setItems(paymentList);

        departmentFilterCB.setItems(FXCollections.observableArrayList("All", "Housekeeping", "Kitchen", "Laundry"));
        departmentFilterCB.getSelectionModel().selectFirst();

        paymentStatusCB.setItems(FXCollections.observableArrayList("All", "Pending", "Paid"));
        paymentStatusCB.getSelectionModel().selectFirst();
    }

    @FXML
    public void returnToDashboardOA(ActionEvent actionEvent) {
        Stage stage = (Stage) paymentTV.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void applyFilterOA(ActionEvent actionEvent) {
        ObservableList<TrackPayments> filtered = paymentList.stream()
                .filter(p -> (dateDP.getValue() == null || p.getDeliveryDate().equals(dateDP.getValue())))
                .filter(p -> departmentFilterCB.getValue().equals("All") || p.getDepartment().equals(departmentFilterCB.getValue()))
                .filter(p -> paymentStatusCB.getValue().equals("All") || p.getPaymentStatus().equals(paymentStatusCB.getValue()))
                .collect(Collectors.toCollection(FXCollections::observableArrayList));

        paymentTV.setItems(filtered);
    }

    @FXML
    public void exportPaymentRecordOA(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Export Payment Records");
        alert.setHeaderText(null);
        alert.setContentText("Payment records exported as PDF successfully.");
        alert.showAndWait();
    }
}
