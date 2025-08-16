package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.time.LocalDate;

public class ManageMarketingController
{
    @FXML
    private TextField camapaignNameTF;
    @FXML
    private TextField targetAudienceTF;
    @FXML
    private DatePicker endDateDP;
    @FXML
    private ComboBox<String> statusCB;
    @FXML
    private Text manageMarketingT;
    @FXML
    private TextField budgetTF;
    @FXML
    private DatePicker startDateDP;

    private final javafx.collections.ObservableList<ManageMarketing> activeCampaigns = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        statusCB.setItems(FXCollections.observableArrayList("Active", "Scheduled", "Completed"));
    }

    @FXML
    public void logoutOA(ActionEvent actionEvent) {
        System.out.println("Logging out...");
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Logged out. Returning to login page.");
        alert.showAndWait();
    }

    @FXML
    public void launchCampaignOA(ActionEvent actionEvent) {
        try {
            String name = camapaignNameTF.getText();
            String audience = targetAudienceTF.getText();
            String budgetStr = budgetTF.getText();
            LocalDate start = startDateDP.getValue();
            LocalDate end = endDateDP.getValue();
            String status = statusCB.getValue();


            if (name == null || name.trim().isEmpty() ||
                    audience == null || audience.trim().isEmpty() ||
                    budgetStr == null || budgetStr.trim().isEmpty() ||
                    start == null || end == null || status == null) {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Please fill in all fields before launching the campaign.");
                alert.showAndWait();
                return;
            }

            double budget;
            try {
                budget = Double.parseDouble(budgetStr);
            } catch (NumberFormatException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid budget. Please enter a numeric value.");
                alert.showAndWait();
                return;
            }

            ManageMarketing campaign = new ManageMarketing(name, budget, audience, start, end, status);
            activeCampaigns.add(campaign);

            System.out.println("Campaign launched: " + campaign);

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Campaign launched successfully!\nStatus: " + status);
            alert.showAndWait();

            camapaignNameTF.clear();
            budgetTF.clear();
            targetAudienceTF.clear();
            startDateDP.setValue(null);
            endDateDP.setValue(null);
            statusCB.setValue(null);

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "An unexpected error occurred: " + e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    public void backOA(ActionEvent actionEvent) {
        System.out.println("Going back to previous page...");
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Returning to previous menu.");
        alert.showAndWait();

    }
}
