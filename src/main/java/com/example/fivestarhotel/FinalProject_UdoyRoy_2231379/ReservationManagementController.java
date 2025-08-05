package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservationManagementController
{
    @javafx.fxml.FXML
    private ComboBox<String> timeCombo;
    @javafx.fxml.FXML
    private Label capacityLabel;
    @javafx.fxml.FXML
    private TableColumn<Reservation,Integer> partySizeCol;
    @javafx.fxml.FXML
    private ComboBox<String> tableCombo;
    @javafx.fxml.FXML
    private ComboBox<String> statusCombo;
    @javafx.fxml.FXML
    private TableView<Reservation> tableView;
    @javafx.fxml.FXML
    private TextField partySizeTextField;
    @javafx.fxml.FXML
    private TextField guestNameTextField;
    @javafx.fxml.FXML
    private TableColumn<Reservation,String> tableCol;
    @javafx.fxml.FXML
    private TableColumn<Reservation, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<Reservation,String> statusCol;
    @javafx.fxml.FXML
    private DatePicker filterDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Reservation,String> guestCol;
    @javafx.fxml.FXML
    private TableColumn<Reservation, LocalTime> timeCol;
    @javafx.fxml.FXML
    private TableColumn<Reservation,Integer> capacityCol;
    @javafx.fxml.FXML
    private TextArea specialRequestTextArea;
    @javafx.fxml.FXML
    private TextField guestIDTextField;
    @javafx.fxml.FXML
    private TableColumn<Reservation,String> guestId;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveUpdateOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rejectOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewRequestOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ApproveOnAction(ActionEvent actionEvent) {
    }
}