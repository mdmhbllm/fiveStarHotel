package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistSignInViewIfJoining {
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private Label userIDToDisplay;
    @javafx.fxml.FXML
    private Label passwordLabel;

    private String passwordVerify;
    private String userIdVerify;
    @javafx.fxml.FXML
    private TextField userIDField;

    @javafx.fxml.FXML
    public void signInOnAction(ActionEvent actionEvent) throws IOException {
        if(userIDField.getText().trim().equals(userIdVerify) && passwordTextField.getText().trim().equals(passwordVerify)){
            FXMLLoader fxmlLoader =  new FXMLLoader(ReceptionistSignInViewIfJoining.class.getResource("receptionistDashBoardView.fxml"));;
            Scene scene = new Scene(fxmlLoader.load());
            Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
            newStage.setScene(scene);
            newStage.show();
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Error");
            alert.setContentText("User Id Password does not match");
            alert.showAndWait();
        }
    }

    public void receiveInformation(String userId, String fullName, String password) {
        userIDToDisplay.setText(userId);
        passwordVerify = password;
        userIdVerify = userId;
    }
}
