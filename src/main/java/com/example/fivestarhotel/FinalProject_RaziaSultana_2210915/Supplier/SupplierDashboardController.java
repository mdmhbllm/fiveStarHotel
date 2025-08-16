package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SupplierDashboardController {

    @FXML
    private Label supplierL, dashboardL;

    private SupplierDashboard currentSupplier;

    public void setSupplier(SupplierDashboard supplier) {
        this.currentSupplier = supplier;
        supplierL.setText(supplier.getCompanyName());
    }

    @FXML
    private void scheduleDeliveriesOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/Supplier/ScheduleDeliveries.fxml");
    }

    @FXML
    private void respondRequestOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/Supplier/RespondRequest.fxml");
    }

    @FXML
    private void replenishStrockOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/Supplier/ReplenishStock.fxml");
    }

    @FXML
    private void viewhotelGuidelineOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/Supplier/ViewHotelGuidelines.fxml");
    }

    @FXML
    private void uploadCatlogOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/Supplier/UploadCatalog.fxml");
    }

    @FXML
    private void updatedeliveryOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/Supplier/UpdateDeliveryStatus.fxml");
    }

    @FXML
    private void analysisHistoryOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/Supplier/AnalyzeDeliveryHistory.fxml");
    }

    @FXML
    private void trackPayementOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/Supplier/TrackPayment.fxml");
    }

    @FXML
    private void LogoutOA(ActionEvent event) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/LoginView.fxml");
    }

    private void switchScene(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();

            if (loader.getController() instanceof SupplierDashboardController controller && currentSupplier != null) {
                controller.setSupplier(currentSupplier);
            }

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
