package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginViewController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void loginAction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        try {
            if (username.equalsIgnoreCase("generalmanager")) {
                switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/GeneralManager/GeneralManagerDashboard.fxml");
            } else if (username.equalsIgnoreCase("supplier")) {
                switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/Supplier/SupplierDashboard.fxml");
            } else {
                System.out.println("Invalid credentials!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Internal scene switching method
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
        return (Stage) usernameField.getScene().getWindow();
    }
}
