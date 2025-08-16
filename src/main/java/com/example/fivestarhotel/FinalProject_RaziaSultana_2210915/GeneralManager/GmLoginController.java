package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class GmLoginController {

    @FXML
    private Label errorL;
    @FXML
    private TextField usernameTF;
    @FXML
    private PasswordField passwordPF;

    @FXML
    public void initialize() {
    }

    @FXML
    public void loginOA(ActionEvent actionEvent) {
        String username = usernameTF.getText();
        String password = passwordPF.getText();

        if (username.equals("gm") && password.equals("1234")) {
            switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/GeneralManager/GeneralManagerDashboard.fxml");
        } else {
            errorL.setText("Invalid username or password");
        }
    }
    private void switchScene(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTF.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
