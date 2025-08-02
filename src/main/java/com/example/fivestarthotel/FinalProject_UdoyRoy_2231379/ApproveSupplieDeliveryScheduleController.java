package com.example.fivestarthotel.FinalProject_UdoyRoy_2231379;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class ApproveSupplieDeliveryScheduleController
{
    @javafx.fxml.FXML
    private TableColumn<DeliveryRequest, LocalDate> deliverydateCol;
    @javafx.fxml.FXML
    private TableColumn<DeliveryRequest,Integer> idCol;
    @javafx.fxml.FXML
    private DatePicker deliveryDateTextField;
    @javafx.fxml.FXML
    private TableColumn<DeliveryRequest, LocalTime> deliveryTime;
    @javafx.fxml.FXML
    private TableColumn<DeliveryRequest,String> supplierCol;
    @javafx.fxml.FXML
    private TextArea rejectionReasonTextArea;
    @javafx.fxml.FXML
    private TableColumn<DeliveryRequest,String> deliverystatusCol;
    @javafx.fxml.FXML
    private TableView<DeliveryRequest> deliveryTableView;
    @javafx.fxml.FXML
    private TableColumn<DeliveryRequest,String> actionCol;
    @javafx.fxml.FXML
    private TableColumn<DeliveryRequest,String> itemsCol;
    @javafx.fxml.FXML
    private ComboBox<String> statusFilterCombo;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmRejectionOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboradOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void cancleOnAction(ActionEvent actionEvent) {
    }
}