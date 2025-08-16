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
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

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
    private TableColumn<TrainingSession, LocalTime> timeCol;
    @javafx.fxml.FXML
    private DatePicker filterdatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> FiltertimeCombo;


    ArrayList<TrainingSession> trainingSessions = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        venuCombo.getItems().addAll("Conference Room A", "Conference Room B", "Training Hall", "Online");
        timeCombo.getItems().addAll("09:00", "11:00", "14:00", "16:00");
        trainerCombo.getItems().addAll("John Smith", "Sarah Johnson", "Michael Brown", "Emily Davis");
        FiltertimeCombo.getItems().addAll("All Times", "09:00", "11:00", "14:00", "16:00");




        sessionIdCol.setCellValueFactory(new PropertyValueFactory<>("sessionId"));
        topicCol.setCellValueFactory(new PropertyValueFactory<>("topic"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        venueCol.setCellValueFactory(new PropertyValueFactory<>("venue"));
        trainerCol.setCellValueFactory(new PropertyValueFactory<>("trainer"));


        if (trainingSessions.isEmpty()) {
            trainingSessions.add(new TrainingSession("T001", "Food Safety",
                    LocalDate.now().plusDays(1), "09:00",
                    "Conference Room A", "John Smith" ));
            trainingSessions.add(new TrainingSession("T002", "Customer Service",
                    LocalDate.now().plusDays(2), "11:00",
                    "Training Hall", "Sarah Johnson"));
            trainingSessions.add(new TrainingSession("T003", "Fire Safety",
                    LocalDate.now().plusDays(3), "14:00",
                    "Online", "Michael Brown"));
        }

        staffTrainingTableView.getItems().setAll(trainingSessions);



    }

    @javafx.fxml.FXML
    public void clearOnActiom(ActionEvent actionEvent) {
        sessionIdTextField.clear();
        topicTextField.clear();
        datePicker.setValue(null);
        timeCombo.setValue(null);
        venuCombo.setValue(null);
        trainerCombo.setValue(null);
        messageLabel.setText("Form cleared.");

    }



    @javafx.fxml.FXML
    public void backToDashBoradOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader FxmlLoader = new FXMLLoader(getClass().getResource("restaurentManager.fxml"));
        Scene scene = new Scene((FxmlLoader.load()));
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();



    }

    @javafx.fxml.FXML
    public void schduleSessionOnAction(ActionEvent actionEvent) {
        String sessionId = sessionIdTextField.getText();
        String topic = topicTextField.getText();
        LocalDate date = datePicker.getValue();
        String time = timeCombo.getValue();
        String venue = venuCombo.getValue();
        String trainer = trainerCombo.getValue();


        if (sessionId.isEmpty() || topic.isEmpty() || date == null || time == null || venue == null || trainer == null) {
            messageLabel.setText("Please fill in all fields!");
            return;
        }

        TrainingSession newSession = new TrainingSession(sessionId, topic, date, time, venue, trainer);
        trainingSessions.add(newSession);
        staffTrainingTableView.getItems().setAll(trainingSessions);

        messageLabel.setText("Session scheduled successfully.");
        clearOnActiom(actionEvent);


    }

    @javafx.fxml.FXML
    public void scarchOnAction(ActionEvent actionEvent) {
        LocalDate filterDate = filterdatePicker.getValue();
        String filterTime = FiltertimeCombo.getValue();

        ArrayList<TrainingSession> filtered = new ArrayList<>();
        for (TrainingSession ts : trainingSessions) {
            boolean matches = true;

            if (filterDate != null && !ts.getDate().equals(filterDate)) {
                matches = false;
            }
            if (filterTime != null && !filterTime.equals("All Times") && !ts.getTime().equals(filterTime)) {
                matches = false;
            }

            if (matches) {
                filtered.add(ts);
            }
        }

        staffTrainingTableView.getItems().setAll(filtered);

        if (filtered.isEmpty()) {
            messageLabel.setText("No sessions found.");
        } else {
            messageLabel.setText("Filtered sessions displayed.");
        }
    }

    }
