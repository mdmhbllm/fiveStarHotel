package com.example.fivestarthotel.FinalProject_UdoyRoy_2231379;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class StaffLeaveRequestConytoller
{
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn<LeaveReaquest, LocalDate> fromCol;
    @javafx.fxml.FXML
    private TableColumn<LeaveReaquest,String> reasonCol;
    @javafx.fxml.FXML
    private TableColumn<LeaveReaquest,String> requestIdCol;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TextArea rejectionReasonTextArea;
    @javafx.fxml.FXML
    private TableView<LeaveReaquest> tableView;
    @javafx.fxml.FXML
    private ComboBox<String> newStatusCombo;
    @javafx.fxml.FXML
    private TableColumn<LeaveReaquest,LocalDate> toCol;
    @javafx.fxml.FXML
    private TableColumn<LeaveReaquest,String> statusCol;
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private TextField currentStatusTextDField;
    @javafx.fxml.FXML
    private TextField requestIdTextField;
    @javafx.fxml.FXML
    private TextArea reasonTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void rejectOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveAndNotifyOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboradOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ApproveOnAction(ActionEvent actionEvent) {
    }
}