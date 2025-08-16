package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel.HotelService;
import com.example.fivestarhotel.Utility.DataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HotelServiceController {

    @FXML
    private TableColumn<HotelService, String> availabilityCol;

    @FXML
    private TableColumn<HotelService, String> descriptionCol;

    @FXML
    private TableView<HotelService> hotelServiceMainTable;

    @FXML
    private TableColumn<HotelService, Double> priceCol;

    @FXML
    private TableColumn<HotelService, String> serviceIDCol;

    @FXML
    private TableColumn<HotelService, String> serviceNameCol;

    @FXML
    private Button usernameDisplay;

    private String receivedUserName;
    private String receivedUserId;


    public void initialize() throws IOException {
        availabilityCol.setCellValueFactory(new PropertyValueFactory<>("availability"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
        serviceIDCol.setCellValueFactory(new PropertyValueFactory<>("serviceId"));
        serviceNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));


        List<HotelService> serviceList = new ArrayList<>();
        HotelService roomCleaning = new HotelService(
                "S001",
                "Room Cleaning",
                "Daily cleaning and tidying of guest rooms",
                25.0,
                "Available"
        );

        HotelService spaTreatment = new HotelService(
                "S002",
                "Spa Treatment",
                "Relaxing full-body massage session",
                50.0,
                "Available"
        );

        HotelService breakfastService = new HotelService(
                "S003",
                "Breakfast Buffet",
                "All-you-can-eat breakfast buffet with drinks",
                15.0,
                "Available"
        );

        HotelService airportShuttle = new HotelService(
                "S004",
                "Airport Shuttle",
                "Pick-up and drop-off service to the airport",
                30.0,
                "Unavailable"
        );

        serviceList.add(roomCleaning);
        serviceList.add(spaTreatment);
        serviceList.add(breakfastService);
        serviceList.add(airportShuttle);

        for(HotelService service: serviceList){
            DataManager.saveObject(service, "HotelService.bin");
        }

        hotelServiceMainTable.getItems().clear();
        hotelServiceMainTable.getItems().addAll(serviceList);
    }


    @FXML
    void userProfileOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(profileViewController.class.getResource("profileView.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)event.getSource()).getScene().getWindow());
        newStage.setScene(scene);
        newStage.show();

    }

    public void receiveInfo(String userNameForward, String userIdForward) {
        usernameDisplay.setText(userNameForward);
        receivedUserName = userNameForward;
        receivedUserId = userIdForward;
    }
}
