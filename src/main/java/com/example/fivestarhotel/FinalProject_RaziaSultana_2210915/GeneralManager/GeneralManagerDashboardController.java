package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class GeneralManagerDashboardController {

    @FXML
    private Label generalManagerL, dashboardL;

    @FXML
    private void superviseOperationsOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/GeneralManager/SuperviseOperations.fxml");
    }

    @FXML
    private void manageStaffOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/GeneralManager/ManageStaff.fxml");
    }

    @FXML
    private void manageEmergenciesOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/GeneralManager/ManageEmergencies.fxml");
    }

    @FXML
    private void guestFeedbackOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/GeneralManager/GuestFeedback.fxml");
    }

    @FXML
    private void monitorFinanceOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/GeneralManager/MonitorFinance.fxml");
    }

    @FXML
    private void manageMarketingOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/GeneralManager/ManageMarketing.fxml");
    }

    @FXML
    private void performAuditsOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/GeneralManager/PerformAudits.fxml");
    }

    @FXML
    private void monitorRoomOccupancyOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/GeneralManager/MonitorRoomOccupancy.fxml");
    }

    @FXML
    private void logoutOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/LoginView.fxml");
    }

    private void switchScene(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();
            Stage stage = getStage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Stage getStage() {
        return (Stage) dashboardL.getScene().getWindow();
    }
}
