package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.time.LocalDate;

public class AnalyzeDeliveryHistoryController {

    @FXML
    private Label analyzeDeliveryHistoryL;

    @FXML
    private ComboBox<String> numberOfDeliveriesTF;

    @FXML
    private TextField issueReportsTF;

    private final AnalyzeDeliveryHistory[] deliveryHistoryArray = new AnalyzeDeliveryHistory[3];

    @FXML
    public void initialize() {
        // Populate sample data
        deliveryHistoryArray[0] = new AnalyzeDeliveryHistory(10, 0.9, "No issues", LocalDate.now().minusDays(10), LocalDate.now());
        deliveryHistoryArray[1] = new AnalyzeDeliveryHistory(15, 0.8, "Delayed once", LocalDate.now().minusDays(40), LocalDate.now().minusDays(10));
        deliveryHistoryArray[2] = new AnalyzeDeliveryHistory(5, 1.0, "Perfect delivery", LocalDate.now().minusDays(20), LocalDate.now().minusDays(5));

        numberOfDeliveriesTF.getItems().addAll("Last 7 days", "Last 30 days", "Last 90 days");
        numberOfDeliveriesTF.getSelectionModel().selectFirst();

        analyzeDeliveryHistoryL.setText("Analyze Delivery History");
    }

    @FXML
    public void returnToDashboardOA() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Return");
        alert.setHeaderText(null);
        alert.setContentText("Returning to dashboard...");
        alert.showAndWait();
    }

    @FXML
    public void applyFilterOA() {
        String selectedPeriod = numberOfDeliveriesTF.getSelectionModel().getSelectedItem();
        LocalDate filterDate;
        switch (selectedPeriod) {
            case "Last 7 days" -> filterDate = LocalDate.now().minusDays(7);
            case "Last 30 days" -> filterDate = LocalDate.now().minusDays(30);
            case "Last 90 days" -> filterDate = LocalDate.now().minusDays(90);
            default -> filterDate = LocalDate.MIN;
        }

        int totalDeliveries = 0;
        double totalOnTimeRate = 0.0;
        int count = 0;
        StringBuilder issuesBuilder = new StringBuilder();

        for (AnalyzeDeliveryHistory d : deliveryHistoryArray) {
            if (!d.getEndDate().isBefore(filterDate)) {
                totalDeliveries += d.getNumberOfDeliveries();
                totalOnTimeRate += d.getOnTimeRate();
                if (!d.getIssueReports().isEmpty()) {
                    if (!issuesBuilder.isEmpty()) {  // Updated here
                        issuesBuilder.append("; ");
                    }
                    issuesBuilder.append(d.getIssueReports());
                }
                count++;
            }
        }

        if (count == 0) {
            issueReportsTF.setText("No records found");
            numberOfDeliveriesTF.setPromptText("");
            analyzeDeliveryHistoryL.setText("Analyze Delivery History");
        } else {
            double averageOnTimeRate = totalOnTimeRate / count;
            issueReportsTF.setText(issuesBuilder.toString());
            numberOfDeliveriesTF.setPromptText(String.valueOf(totalDeliveries));
            analyzeDeliveryHistoryL.setText("Analyze Delivery History - Avg On-Time Rate: "
                    + String.format("%.2f", averageOnTimeRate * 100) + "%");
        }
    }

    @FXML
    public void onTimeRateOA() {
    }

    @FXML
    public void generatePDFReportOA() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("PDF Report");
        alert.setHeaderText(null);
        alert.setContentText("PDF report generated successfully (placeholder)");
        alert.showAndWait();
    }
}

