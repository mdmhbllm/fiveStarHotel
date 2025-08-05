package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel.HotelInformation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import static javafx.application.Application.launch;

public class ListOfHotelIfNotSignInController {

    @FXML
    private TableColumn<HotelInformation, String> AvailabilityStatusCol;

    @FXML
    private TableColumn<HotelInformation, Integer> AverageRoomPriceCol;

    @FXML
    private Label DateOfStayLabel;

    @FXML
    private Label DestinationLabel;

    @FXML
    private TableColumn<HotelInformation, Void> ViewRateCol;

    @FXML
    private TableColumn<HotelInformation, String> hotellNameCol;

    @FXML
    private TableView<HotelInformation> mainTable;

    @FXML
    private Label roomAndGuestNoLabel;

    @FXML
    private Text yourSearchLabel;

    @FXML
    public void initialize(){
        hotellNameCol.setCellValueFactory(new PropertyValueFactory<>("hotelName"));
        AverageRoomPriceCol.setCellValueFactory(new PropertyValueFactory<>("averageRoomPrice"));
        AvailabilityStatusCol.setCellValueFactory(new PropertyValueFactory<>("availabilityStatus"));
        addButtonToViewRateColumn();

        mainTable.getItems().addAll(
                new HotelInformation("Hotel Sunshine", 120, "Available"),
                new HotelInformation("Grand Plaza", 200, "Booked"),
                new HotelInformation("Elite Stay", 150, "Available")
        );
    }

    private void addButtonToViewRateColumn() {
        ViewRateCol.setCellFactory(col -> new TableCell<>() {
            private final Button btn = new Button("Selected");

            {
                btn.setOnAction((ActionEvent event) -> {
                    HotelInformation hotelInfo = getTableView().getItems().get(getIndex());
                    System.out.println("Selected Hotel: " + hotelInfo.getHotelName());
                    // You can perform any action with 'hotelInfo' here (like open a new scene, etc.)
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(btn);
                }
            }
        });
    }


    @FXML
    public void joinOnAction(ActionEvent event) {

    }

    @FXML
    public void signInOnAction(ActionEvent event) {

    }

}
