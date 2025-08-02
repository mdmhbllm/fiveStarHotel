package com.example.fivestarthotel.FinalProject_MahbubAlam_2221100;

import com.example.fivestarthotel.fiveStarHotelMainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class guestViewController {


    public Label showMassage;
    @FXML
    private TextField userNameTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private BorderPane borderPane;
    @FXML
    private Label usernameLabel;
    @FXML
    private Label passwordLabel;

    @FXML
    public void logionOnAction(ActionEvent actionEvent) throws IOException {

    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText("Input Validation");
        alert.setContentText(message);
        alert.showAndWait(); // You missed this!
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(fiveStarHotelMainApplication.class.getResource("loginview.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void nextButtonOnAction(ActionEvent actionEvent) {
    }
}