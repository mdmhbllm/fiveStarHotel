package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import com.example.fivestarhotel.Utility.DataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManageAccountController {
    @javafx.fxml.FXML
    private TextField zipTextField;
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private TextField lastNameTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField cityTextField;
    @javafx.fxml.FXML
    private ComboBox countryComboBox;
    @javafx.fxml.FXML
    private TextField firstNameTextField;
    @javafx.fxml.FXML
    private Button userNameDisplay;

    private String guestId;
    private String guestName;

    public void initialize(){
        countryComboBox.getItems().addAll("Bangladesh", "Uk", "USA", "Canada");
    }

    @javafx.fxml.FXML
    public void saveOnAction(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        String firstName = firstNameTextField.getText().trim();
        String lastName = lastNameTextField.getText().trim();
        String fullName = firstName+" "+lastName;
        String email = emailTextField.getText().trim();
        String address = addressTextField.getText().trim();
        String phone = phoneTextField.getText().trim();
        String city = cityTextField.getText().trim();
        String zip = zipTextField.getText().trim();
        String country = (String) countryComboBox.getValue();
        String oldGuestId = null;
        String oldPassword = null;
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error Dialog");
        alert.setHeaderText("Error");

        if(firstName.isEmpty()){
            alert.setContentText("Enter the first name");
            alert.showAndWait();
        } else if (lastName.isEmpty()) {
            alert.setContentText("Enter the last name");
            alert.showAndWait();
        }else if (email.isEmpty()) {
            alert.setContentText("Enter the email");
            alert.showAndWait();
        }else if (address.isEmpty()) {
            alert.setContentText("Enter the address");
            alert.showAndWait();
        }else if (phone.isEmpty()) {
            alert.setContentText("Enter phone number");
            alert.showAndWait();
        }else if (city.isEmpty()) {
            alert.setContentText("Enter city name");
            alert.showAndWait();
        }else if (zip.isEmpty()) {
            alert.setContentText("Enter the zip code");
            alert.showAndWait();
        } else if (country.isEmpty()) {
            alert.setContentText("Select Country name");
            alert.showAndWait();
        }


        List<Guest> guestList = DataManager.getObject("Guest.bin");
        List<Guest> newguesttList = new ArrayList<>();
        for(Guest guest: guestList){
            if(guest.getUserId().equals(guestId)){
                oldGuestId = guest.getUserId();
                oldPassword = guest.getPassword();
            }else{
                newguesttList.add(guest);
            }
        }

        Guest updatedGuest = new Guest(fullName, email, oldPassword, phone, oldGuestId, "RegisteredGuest",
                address, country, zip, city);
        newguesttList.add(updatedGuest);
        DataManager.saveUpdatedObject(newguesttList, "Guest.bin");

        Alert alert_two = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Dialog");
        alert.setHeaderText("Confirm");
        alert.setContentText("Your data has been updated");
        alert.showAndWait();
    }


    @javafx.fxml.FXML
    public void userProfileOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(ManageAccountController.class.getResource("profileView.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setScene(scene);
        newStage.show();
    }


    public void receiveInfo(String userNameForward, String userIdForward) {
        guestId = userIdForward;
        guestName = userNameForward;
        userNameDisplay.setText(userNameForward);
    }
}
