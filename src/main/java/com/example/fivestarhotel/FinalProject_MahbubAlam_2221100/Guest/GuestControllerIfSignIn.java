package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class GuestControllerIfSignIn {
    public static String guestName;
    public static LocalDate gcheckInDate;
    public static LocalDate gcheckOutDta;
    public static String gnumberOfGuest;
    public static String gnumberOfRoom;

    @javafx.fxml.FXML
    private Button userNameOnButton;
    @javafx.fxml.FXML
    private Label userNameDisplayLabel;
    @FXML
    private ComboBox<String> numberOfGuestCombobox;
    @FXML
    private ComboBox<String> roomNUmberCombobox;
    @FXML
    private TextField searchInput;
    @FXML
    private DatePicker checkOutDate;
    @FXML
    private DatePicker checInDate;
    @FXML
    private Label massage;

    @FXML
    public void initialize(){
        numberOfGuestCombobox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        roomNUmberCombobox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    }

    public void getinformation(String memberName) {
        userNameDisplayLabel.setText(memberName);
        userNameOnButton.setText(memberName);
        guestName = memberName;
    }


    @FXML
    public void userProfileOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(GuestControllerIfSignIn.class.getResource("profileView.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    public void searchOnAction(ActionEvent event) throws IOException {
        if (searchInput.getText().trim().isEmpty()){
            massage.setText("Please Enter a You destination");
            return;
        }
        else if (checInDate.getValue() == null){
            massage.setText("Please select check in date");
            return;
        }
        else if (checkOutDate.getValue() == null){
            massage.setText("Please select check out date");
            return;
        }
        else if (numberOfGuestCombobox.getValue() == null){
            massage.setText("Please Enter select number of guest");
            return;
        }
        else if (roomNUmberCombobox.getValue() == null){
            massage.setText("Please Enter select number of room");
            return;
        }

        String destination = searchInput.getText();
        LocalDate dateOfStay = checInDate.getValue();
        String roomCount = roomNUmberCombobox.getValue();
        String guestCount = numberOfGuestCombobox.getValue();

        gcheckInDate = checInDate.getValue();
        gcheckOutDta = checkOutDate.getValue();
        gnumberOfGuest = numberOfGuestCombobox.getValue();
        gnumberOfRoom = roomNUmberCombobox.getValue();


        FXMLLoader fxmlLoader = new FXMLLoader(GuestControllerIfNotSignIn.class.getResource("listOfhotelViewIfSignIn.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = new Stage();
        newStage.setScene(scene);

        ListOfHotelIfNotSignInController nextController = fxmlLoader.getController();
        nextController.recieveInfoFromGuestControllerIfNotSignIn(destination, dateOfStay, roomCount, guestCount);


        newStage.show();

        searchInput.clear();
        checInDate.setValue(null);
        checkOutDate.setValue(null);
        numberOfGuestCombobox.setValue(null);
        roomNUmberCombobox.setValue(null);
    }

}
