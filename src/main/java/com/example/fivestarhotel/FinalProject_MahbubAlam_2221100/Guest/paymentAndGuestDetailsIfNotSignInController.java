package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel.Booking;
import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel.Payment;
import com.example.fivestarhotel.Utility.DataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class paymentAndGuestDetailsIfNotSignInController {
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private Label roomIdToBook;
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private TextField lastNameTextField;
    @javafx.fxml.FXML
    private TextField cardNumberTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField cardYearDateTextField;
    @javafx.fxml.FXML
    private ComboBox countrySelectionCombobox;
    @javafx.fxml.FXML
    private TextField cityTextField;
    @javafx.fxml.FXML
    private TextField guestFirstNameTextField;
    @javafx.fxml.FXML
    private TextField cardMonthDateTexrField;
    @javafx.fxml.FXML
    private Label roomPriceToBook;
    @javafx.fxml.FXML
    private TextField zipCodeTextField;

    @FXML
    public void initialize(){
        countrySelectionCombobox.getItems().addAll("Bangladesh", "UK", "US", "Canada", "Italy");

    }

    @FXML
    public void joinOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GuestControllerIfNotSignIn.class.getResource("joinView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    public void signInOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GuestControllerIfNotSignIn.class.getResource("guestSignInViewIfJoined.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.show();

    }

    @javafx.fxml.FXML
    public void bookReservationOnAction(ActionEvent actionEvent) throws IOException {
        String firstName = guestFirstNameTextField.getText().trim();
        String lastName = lastNameTextField.getText().trim();
        String fullName = firstName +" "+lastName;
        String email = emailTextField.getText().trim();
        String phone = phoneTextField.getText().trim();
        String address = addressTextField.getText().trim();
        String city = cityTextField.getText().trim();
        String zip = zipCodeTextField.getText().trim();
        String country = (String) countrySelectionCombobox.getValue();

        String cardNumber = cardNumberTextField.getText().trim();
        int cardExpieryYear = Integer.parseInt(cardYearDateTextField.getText());
        int cardExperiyMonth = Integer.parseInt(cardMonthDateTexrField.getText());

        Guest guest = new Guest(fullName, email, phone, address, country, zip, city);
        DataManager.saveObject(guest, "Guest.bin");

        Booking booking = new Booking(guest,roomId, rCheckInDate, rChekOutDate, rNmberOfGest, rNumberOfRoom, "Booked",roomPrice );
        guest.addBooking(booking);

        DataManager.saveObject(booking, "Booking.bin");

        Payment payment = new Payment(booking, booking.getTotalPrice(), "Card", cardNumber, fullName, cardExpieryYear, cardExperiyMonth);

        if (payment.processPayment()){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/fivestarhotel/FinalProject_MahbubAlam_2221100/Guest/successMasageView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.show();
        }
        DataManager.saveObject(payment, "Payment.bin");

    }

    Double roomPrice;
    String roomId;

    public void receiveRoomInfo(String id, Double price){
        roomIdToBook.setText(id);
        roomPriceToBook.setText(String.valueOf(price));
        roomPrice = price;
        roomId = id;
    }

    LocalDate rCheckInDate;
    LocalDate rChekOutDate;
    String rNmberOfGest;
    int rNumberOfRoom;

    public void receviewGuestInfo(LocalDate checkInDate, LocalDate checkOutDta, String numberOfGuest, String numberOfRoom) {
        rCheckInDate = checkInDate;
        rChekOutDate = checkOutDta;
        rNumberOfRoom = Integer.parseInt(numberOfRoom);
        rNmberOfGest = numberOfGuest;
    }
}
