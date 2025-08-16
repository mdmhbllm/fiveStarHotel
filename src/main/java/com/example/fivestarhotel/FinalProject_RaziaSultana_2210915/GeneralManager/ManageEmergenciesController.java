package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ManageEmergenciesController {

    @FXML
    private TableColumn<ManageEmergencies, String> typeCol;
    @FXML
    private TableColumn<ManageEmergencies, String> statusCol;
    @FXML
    private TableColumn<ManageEmergencies, String> severityCol;
    @FXML
    private ComboBox<String> incidentTypeCB;
    @FXML
    private Label manageEmergenciesL;
    @FXML
    private TableColumn<ManageEmergencies, String> dataorTimeCol;
    @FXML
    private TableColumn<ManageEmergencies, String> incidentIdCol;
    @FXML
    private TableView<ManageEmergencies> emergencyTV;
    @FXML
    private TextArea incidentDetailsTA;

    private final ObservableList<ManageEmergencies> emergencyList = FXCollections.observableArrayList();
    private File attachedFile;

    @FXML
    public void initialize() {
        incidentIdCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getIncidentId()));
        dataorTimeCol.setCellValueFactory(data -> {
            LocalDateTime dt = data.getValue().getDateTime();
            String formatted = dt != null ? dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) : "";
            return new javafx.beans.property.SimpleStringProperty(formatted);
        });
        typeCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getType()));
        severityCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getSeverity()));
        statusCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getStatus()));

        emergencyList.addAll(
                new ManageEmergencies("INC001", LocalDateTime.of(2025, 8, 16, 10, 30), "Fire", "High", "Resolved"),
                new ManageEmergencies("INC002", LocalDateTime.of(2025, 8, 15, 15, 20), "Injury", "Medium", "Pending"),
                new ManageEmergencies("INC003", LocalDateTime.of(2025, 8, 14, 9, 0), "Equipment Failure", "Low", "In Progress")
        );
        emergencyTV.setItems(emergencyList);

        incidentTypeCB.setItems(FXCollections.observableArrayList("Fire", "Injury", "Equipment Failure"));
    }

    @FXML
    public void attatchFileOA(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Attach File");
        attachedFile = fileChooser.showOpenDialog(null);

        if (attachedFile != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "File attached: " + attachedFile.getName());
            alert.showAndWait();
        }
    }

    @FXML
    public void submitReportOA(ActionEvent actionEvent) {
        String details = incidentDetailsTA.getText();
        String type = incidentTypeCB.getValue();

        if (details == null || details.trim().isEmpty() || type == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Please fill all details before submitting.");
            alert.showAndWait();
            return;
        }

        String newId = "INC" + String.format("%03d", emergencyList.size() + 1);
        LocalDateTime now = LocalDateTime.now();

        emergencyList.add(new ManageEmergencies(newId, now, type, "Pending", "Reported"));

        System.out.println("Incident logged: " + newId);
        if (attachedFile != null) {
            System.out.println("Attached file: " + attachedFile.getAbsolutePath());
        }


        incidentDetailsTA.clear();
        incidentTypeCB.setValue(null);
        attachedFile = null;

        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Incident report submitted successfully.");
        alert.showAndWait();
    }

    @FXML
    public void logoutOA(ActionEvent actionEvent) {
        System.out.println("Logging out...");
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Logged out. Returning to login page.");
        alert.showAndWait();
    }

    @FXML
    public void reportIncidentOA(ActionEvent actionEvent) {
        incidentDetailsTA.clear();
        incidentTypeCB.setValue(null);
        attachedFile = null;
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Fill the form below to report a new incident.");
        alert.showAndWait();
    }
}
