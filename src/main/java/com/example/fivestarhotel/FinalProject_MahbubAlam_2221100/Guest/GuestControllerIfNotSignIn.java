package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class GuestControllerIfNotSignIn {

    public static LocalDate pcheckInDate;
    public static LocalDate pcheckOutDta;
    public static String pnumberOfGuest;
    public static String pnumberOfRoom;
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
    public void joinHotelOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GuestControllerIfNotSignIn.class.getResource("joinView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = new Stage();
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

        pcheckInDate = checInDate.getValue();
        pcheckOutDta = checkOutDate.getValue();
        pnumberOfGuest = numberOfGuestCombobox.getValue();
        pnumberOfRoom = roomNUmberCombobox.getValue();


        FXMLLoader fxmlLoader = new FXMLLoader(GuestControllerIfNotSignIn.class.getResource("listOfhotelViewIfNotSignIn.fxml"));
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


    @FXML
    public void signInOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GuestControllerIfNotSignIn.class.getResource("guestSignInViewIfJoined.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    public void initialize(){
        numberOfGuestCombobox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        roomNUmberCombobox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    }

}
