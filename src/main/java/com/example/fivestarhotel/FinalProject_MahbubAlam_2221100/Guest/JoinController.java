package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;
import com.example.fivestarhotel.Utility.DataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class JoinController {
    @javafx.fxml.FXML
    private TextField addessTextField;
    @javafx.fxml.FXML
    private TextField zipTextField;
    @javafx.fxml.FXML
    private TextField passWordTextField;
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private TextField lastNameTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField cityTextField;
    @javafx.fxml.FXML
    private ComboBox countryCombobox;
    @javafx.fxml.FXML
    private TextField firstNameTextField;
    @javafx.fxml.FXML
    private TextField confirmPasswordTextField;

    @javafx.fxml.FXML
    public void joinButtonOnAction(ActionEvent actionEvent) throws IOException {
       String address =  addessTextField.getText().trim();
       String zip = zipTextField.getText().trim();
       String password = passWordTextField.getText().trim();
       String confirmPassword = confirmPasswordTextField.getText().trim();
       String phone = phoneTextField.getText().trim();
       String firstname = firstNameTextField.getText().trim();
       String lastname = lastNameTextField.getText().trim();
       String fullName = firstname +" "+ lastname;
       String email = emailTextField.getText().trim();
       String city = cityTextField.getText().trim();
       String country = String.valueOf(countryCombobox.getValue());

       Alert alert = new Alert(Alert.AlertType.ERROR);
       alert.setTitle("Error Dialog");
       alert.setHeaderText("Error Alert");

       if(address.isEmpty()){
           alert.setContentText("Address field is empty");
           alert.showAndWait();
       } else if (zip.isEmpty()) {
           alert.setContentText("ZIP code is empty");
           alert.showAndWait();
       } else if(password.isEmpty()){
           alert.setContentText("Password code is empty");
           alert.showAndWait();
       } else if (confirmPassword.isEmpty()) {
           alert.setContentText("Confirm Password code is empty");
           alert.showAndWait();
       } else if (phone.isEmpty()) {
           alert.setContentText("Phone number is empty");
           alert.showAndWait();
       } else if (firstname.isEmpty()) {
           alert.setContentText("First name is empty");
           alert.showAndWait();
       } else if (lastname.isEmpty()) {
           alert.setContentText("Last name is empty");
           alert.showAndWait();
       } else if (email.isEmpty()) {
           alert.setContentText("Email is empty");
           alert.showAndWait();
       } else if (city.isEmpty()) {
           alert.setContentText("City is empty");
           alert.showAndWait();
       } else if (country.isEmpty()) {
           alert.setContentText("Country is empty");
           alert.showAndWait();
       }

       Guest guest = new Guest(fullName, email, password, phone, "RegisteredUser",address, country, zip, city);
       DataManager.saveObject(guest, "Guest.bin");


       FXMLLoader fxmlLoader =  new FXMLLoader(JoinController.class.getResource("guestSignInViewJoining.fxml"));;
       Scene scene = new Scene(fxmlLoader.load());
       Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
       newStage.setScene(scene);

       GuestSignInViewJoiningController nextController = fxmlLoader.getController();
       nextController.receiveInformation(guest.getUserId(), fullName,guest.getPassword());
       newStage.show();
    }

    @javafx.fxml.FXML
    public void signInButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(JoinController.class.getResource("guestSignInViewIfJoined.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setTitle("Sign In");
        newStage.setScene(scene);
        newStage.show();
    }

    @javafx.fxml.FXML
    public void showTheSameView(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(JoinController.class.getResource("joinView.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setTitle("Join");
        newStage.setScene(scene);
        newStage.show();
    }
}

