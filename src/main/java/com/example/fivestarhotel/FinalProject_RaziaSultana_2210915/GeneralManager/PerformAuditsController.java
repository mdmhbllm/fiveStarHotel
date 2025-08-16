package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class PerformAuditsController {

    @FXML
    private Label performAuditsL;
    @FXML
    private TableColumn<AuditData, String> complianceStatusCol;
    @FXML
    private TableColumn<AuditData, String> departmentNameCol;
    @FXML
    private TableColumn<AuditData, String> lastAudtiDateCol;
    @FXML
    private TableView<AuditData> auditTV;
    @FXML
    private ComboBox<String> departmentCB;
    @FXML
    private TableColumn<AuditData, String> auditScoreCol;

    private ObservableList<AuditData> masterAuditList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        departmentNameCol.setCellValueFactory(cellData -> cellData.getValue().departmentNameProperty());
        lastAudtiDateCol.setCellValueFactory(cellData -> cellData.getValue().lastAuditDateProperty());
        auditScoreCol.setCellValueFactory(cellData -> cellData.getValue().auditScoreProperty());
        complianceStatusCol.setCellValueFactory(cellData -> cellData.getValue().complianceStatusProperty());

        departmentCB.setItems(FXCollections.observableArrayList(
                "All Departments", "Housekeeping", "Front Desk", "Food & Beverage", "Maintenance", "Security"
        ));
        departmentCB.getSelectionModel().selectFirst();

        masterAuditList.addAll(
                new AuditData("Housekeeping", "2025-08-10", "95%", "Compliant"),
                new AuditData("Front Desk", "2025-08-08", "80%", "Warning"),
                new AuditData("Food & Beverage", "2025-08-05", "60%", "Non-Compliant"),
                new AuditData("Maintenance", "2025-08-07", "88%", "Compliant"),
                new AuditData("Security", "2025-08-09", "92%", "Compliant")
        );

        auditTV.setItems(masterAuditList);
    }

    @FXML
    public void logOutOA(ActionEvent actionEvent) {
        System.out.println("Logging out... Returning to login screen.");
        // TODO: FXMLLoader to load login.fxml
    }

    @FXML
    public void backOA(ActionEvent actionEvent) {
        System.out.println("Returning to General Manager dashboard...");
        // TODO: FXMLLoader to load dashboard.fxml
    }

    @FXML
    public void viewAuditOA(ActionEvent actionEvent) {
        String selectedDept = departmentCB.getValue();
        ObservableList<AuditData> filtered = masterAuditList.stream()
                .filter(a -> selectedDept.equals("All Departments") || a.getDepartmentName().equals(selectedDept))
                .collect(Collectors.toCollection(FXCollections::observableArrayList));

        auditTV.setItems(filtered);

        if (!filtered.isEmpty()) {
            AuditData selectedAudit = filtered.get(0);
            Alert details = new Alert(Alert.AlertType.INFORMATION);
            details.setTitle("Audit Details");
            details.setHeaderText("Audit Report for " + selectedAudit.getDepartmentName());
            details.setContentText(
                    "Pass/Fail Checklist:\n - Cleanliness: Pass\n - Safety Equipment: Pass\n - Staff Training: Fail\n\n"
                            + "Identified Issues: Staff training records incomplete\n"
                            + "Corrective Actions: Schedule training by Aug 20\n"
                            + "Deadline: 2025-08-20"
            );
            details.showAndWait();
        } else {
            Alert noData = new Alert(Alert.AlertType.WARNING, "No audit data found for the selected department.", ButtonType.OK);
            noData.showAndWait();
        }
    }

    public static class AuditData {
        private final javafx.beans.property.SimpleStringProperty departmentName;
        private final javafx.beans.property.SimpleStringProperty lastAuditDate;
        private final javafx.beans.property.SimpleStringProperty auditScore;
        private final javafx.beans.property.SimpleStringProperty complianceStatus;

        public AuditData(String departmentName, String lastAuditDate, String auditScore, String complianceStatus) {
            this.departmentName = new javafx.beans.property.SimpleStringProperty(departmentName);
            this.lastAuditDate = new javafx.beans.property.SimpleStringProperty(lastAuditDate);
            this.auditScore = new javafx.beans.property.SimpleStringProperty(auditScore);
            this.complianceStatus = new javafx.beans.property.SimpleStringProperty(complianceStatus);
        }

        public String getDepartmentName() { return departmentName.get(); }
        public javafx.beans.property.StringProperty departmentNameProperty() { return departmentName; }

        public String getLastAuditDate() { return lastAuditDate.get(); }
        public javafx.beans.property.StringProperty lastAuditDateProperty() { return lastAuditDate; }

        public String getAuditScore() { return auditScore.get(); }
        public javafx.beans.property.StringProperty auditScoreProperty() { return auditScore; }

        public String getComplianceStatus() { return complianceStatus.get(); }
        public javafx.beans.property.StringProperty complianceStatusProperty() { return complianceStatus; }
    }
}
