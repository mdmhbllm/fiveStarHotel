package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel.Hotel;
import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel.HotelViewRowSetting;
import com.example.fivestarhotel.Utility.DataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static javafx.application.Application.launch;

public class ListOfHotelIfNotSignInController {

    @FXML
    private TableColumn<HotelViewRowSetting, String> AvailabilityStatusCol;

    @FXML
    private TableColumn<HotelViewRowSetting, Integer> AverageRoomPriceCol;

    @FXML
    private Label DateOfStayLabel;

    @FXML
    private Label DestinationLabel;

    @FXML
    private TableColumn<HotelViewRowSetting, Button> ViewRateCol;

    @FXML
    private TableColumn<HotelViewRowSetting, String> hotellNameCol;

    @FXML
    private TableView<HotelViewRowSetting> mainTable;

    @FXML
    private Label roomAndGuestNoLabel;

    @FXML
    private Text yourSearchLabel;
    @FXML
    private TableColumn<HotelViewRowSetting, String> locationCol;
    List<Hotel> allHotels = new ArrayList<>();

    @FXML
    public void initialize() throws IOException {
        hotellNameCol.setCellValueFactory(new PropertyValueFactory<>("hotelName"));
        AverageRoomPriceCol.setCellValueFactory(new PropertyValueFactory<>("averageRoomPrice"));
        AvailabilityStatusCol.setCellValueFactory(new PropertyValueFactory<>("availabilityStatus"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        ViewRateCol.setCellValueFactory(new PropertyValueFactory<>("actionButton"));


        allHotels.add(new Hotel("Radisson Blu Dhaka", 133, "Available", "Dhaka"));
        allHotels.add(new Hotel("Pan Pacific Sonargaon", 196, "Available", "Dhaka"));
    }


    @FXML
    public void recieveInfoFromGuestControllerIfNotSignIn(String destination, LocalDate checkInDate, String roomCount, String guestCount) throws IOException {
        DestinationLabel.setText(destination);
        DateOfStayLabel.setText(String.valueOf(checkInDate));
        roomAndGuestNoLabel.setText(roomCount+",  "+ guestCount);

        List<HotelViewRowSetting> guestSearchedHotel = new ArrayList<>();
        for (Hotel hotel : allHotels) {
            if (hotel.getLocation().equals(DestinationLabel.getText())) {
                HotelViewRowSetting row = new HotelViewRowSetting(hotel);
                setButtonAction(row);
                guestSearchedHotel.add(row);
            }
        }

        for (Hotel hotel: allHotels){
            DataManager.saveObject(hotel, "Hotel.bin");
        }

        mainTable.getItems().clear();
        mainTable.getItems().addAll(guestSearchedHotel);
    }

    private void setButtonAction(HotelViewRowSetting row) {
        row.getActionButton().setOnAction(e -> {
            String fxmlFile = "";

            if (row.getHotelName().equals("Radisson Blu Dhaka")) {
                fxmlFile = "/com/example/fivestarhotel/FinalProject_MahbubAlam_2221100/Guest/radissonViewIfNotSignIn.fxml";
            } else if (row.getHotelName().equals("Pan Pacific Sonargaon")) {
                fxmlFile = "/com/example/fivestarhotel/FinalProject_MahbubAlam_2221100/Guest/panPacificViewIfNotSignIn.fxml";
            }

            FXMLLoader fxmlLoader = new FXMLLoader(GuestControllerIfNotSignIn.class.getResource(fxmlFile));
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.show();
        });
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
        FXMLLoader fxmlLoader = new FXMLLoader(GuestControllerIfNotSignIn.class.getResource("receptionistSignInViewIfJoined.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.show();

    }

    @FXML
    public void editSearchLabel(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(GuestControllerIfNotSignIn.class.getResource("guestViewIfNotSignIn.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}
