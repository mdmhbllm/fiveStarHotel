package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class StaffTrainingController
{
    @javafx.fxml.FXML
    private TableColumn<TrainingSession,String> topicCol;
    @javafx.fxml.FXML
    private TextField sessionIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> venuCombo;
    @javafx.fxml.FXML
    private ComboBox<String> timeCombo;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession,String> venueCol;
    @javafx.fxml.FXML
    private ComboBox<String> trainerCombo;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextField topicTextField;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession,String> trainerCol;
    @javafx.fxml.FXML
    private TableView<TrainingSession> staffTrainingTableView;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession,String> sessionIdCol;
    @javafx.fxml.FXML
    private CheckBox attendesCombo;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession, LocalTime> timeCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void clearOnActiom(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewRequestOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashBoradOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void schduleSessionOnAction(ActionEvent actionEvent) {
    }
}