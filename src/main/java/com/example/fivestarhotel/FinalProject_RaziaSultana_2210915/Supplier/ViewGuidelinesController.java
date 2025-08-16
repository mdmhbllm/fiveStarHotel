package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ViewGuidelinesController {

    @FXML
    private Label viewHotelGuidelinesL;

    @FXML
    public void initialize() {
    }

    @FXML
    public void returnToDashboardOA(ActionEvent actionEvent) {
        viewHotelGuidelinesL.getScene().getWindow().hide();
    }

    @FXML
    public void procurementRulesOA(ActionEvent actionEvent) {
        System.out.println("Procurement Rules button clicked");
    }

    @FXML
    public void deliveryTimeframesOA(ActionEvent actionEvent) {
        System.out.println("Delivery Timeframes button clicked");
    }

    @FXML
    public void qualityStandardOA(ActionEvent actionEvent) {
        System.out.println("Quality Standards button clicked");
    }
}
