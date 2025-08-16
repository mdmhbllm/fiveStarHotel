package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ReplenishStockController {

    @FXML
    private TextField itemNameTF;

    @FXML
    private TextField currentStockTF;

    @FXML
    private DatePicker deliveryWindowDP;

    @FXML
    private Label replenishmentRequestSubmittedL;

    @FXML
    public void initialize() {
        replenishmentRequestSubmittedL.setVisible(false);
    }

    @FXML
    public void submitRequestOA(ActionEvent actionEvent) {
        try {
            String itemName = itemNameTF.getText();
            int currentStock = Integer.parseInt(currentStockTF.getText());
            int recommendedQuantity = currentStock + 10;

            String deliveryWindow = deliveryWindowDP.getValue().toString();

            ReplenishStock request = new ReplenishStock(itemName, currentStock, recommendedQuantity, deliveryWindow);

            System.out.println("Replenishment Request Submitted: " + request);

            replenishmentRequestSubmittedL.setVisible(true);

            itemNameTF.clear();
            currentStockTF.clear();
            deliveryWindowDP.setValue(null);

        } catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setHeaderText("Please fill all fields correctly.");
            alert.showAndWait();
        }
    }

    @FXML
    public void returnToDashboardOA(ActionEvent actionEvent) {
        System.out.println("Returning to dashboard...");

    }
}
