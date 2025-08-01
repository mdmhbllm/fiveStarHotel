package com.example.fivestarthotel.GeneralManager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MonitorRoomController
{
    @javafx.fxml.FXML
    private TextField availableRoomsTF;
    @javafx.fxml.FXML
    private TextField averageDailyRateTF;
    @javafx.fxml.FXML
    private TextField roomNumberTF;
    @javafx.fxml.FXML
    private Label monitorRoomOccupancyL;
    @javafx.fxml.FXML
    private TextField upcomingBookingsTF;
    @javafx.fxml.FXML
    private ComboBox roomTypeCB;
    @javafx.fxml.FXML
    private DatePicker dataRangeDP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void returnToDashboardOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateViewOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateOccupancyReportOA(ActionEvent actionEvent) {
    }
}