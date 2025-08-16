package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel.Room;
import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel.RoomTableViewRowSetting;
import com.example.fivestarhotel.Utility.DataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class panSpacificViewControllerIfNotSignIn
{
    @FXML
    private TableColumn<RoomTableViewRowSetting, String> availabilityStatusCol;

    @FXML
    private TableColumn<RoomTableViewRowSetting, String> roomIDCol;

    @FXML
    private TableColumn<RoomTableViewRowSetting, Double> roomPriceCol;

    @FXML
    private TableColumn<RoomTableViewRowSetting, String> roomTypeCol;

    @FXML
    private TableColumn<RoomTableViewRowSetting, Button> selectButtonCol;
    @FXML
    private TableView<RoomTableViewRowSetting> roomTableView;



    public void initialize() throws IOException, ClassNotFoundException {
        roomIDCol.setCellValueFactory(new PropertyValueFactory<>("roomId"));
        roomPriceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
        roomTypeCol.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        availabilityStatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        selectButtonCol.setCellValueFactory(new PropertyValueFactory<>("actionButton"));


        List<Room> roomList = new ArrayList<>();
        List<RoomTableViewRowSetting> roomListTableView = new ArrayList<>();

        Room room1 = new Room("101", "Single", 120.0, "Available", "Cozy single room with city view");
        Room room2 = new Room("102", "Double", 180.0, "Available", "Spacious double room with balcony");
        Room room3 = new Room("103", "Single", 130.0, "Sold Out", "Single room with garden view");
        Room room4 = new Room("201", "Suite", 350.0, "Sold Out", "Luxury suite with sea view");

        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        roomList.add(room4);


        for (Room room: roomList){
            RoomTableViewRowSetting r = new RoomTableViewRowSetting(room);
            setButtonAction(r);
            roomListTableView.add(r);
            DataManager.saveObject(room, "Room.bin");
        }

        roomTableView.getItems().clear();
        roomTableView.getItems().addAll(roomListTableView);
    }

    private void setButtonAction(RoomTableViewRowSetting row) {
        row.getActionButton().setOnAction(e -> {

            if(row.getStatus().equals("Available")){
                FXMLLoader fxmlLoader = new FXMLLoader(GuestControllerIfNotSignIn.class.getResource("paymentAndGuestDetailsViewIfNotSignIn.fxml"));
                Scene scene = null;
                try {
                    scene = new Scene(fxmlLoader.load());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                Stage newStage = new Stage();
                newStage.setScene(scene);
                newStage.setScene(scene);
                paymentAndGuestDetailsIfNotSignInController nextController = fxmlLoader.getController();
                nextController.receiveRoomInfo(row.getRoomId(), row.getPrice());

                nextController.receviewGuestInfo(
                        GuestControllerIfNotSignIn.pcheckInDate,
                        GuestControllerIfNotSignIn.pcheckOutDta,
                        GuestControllerIfNotSignIn.pnumberOfGuest,
                        GuestControllerIfNotSignIn.pnumberOfRoom
                );
                newStage.show();
            }
            else{
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning Dialog");
                alert.setHeaderText("Wearning Alert");
                alert.setContentText("This Room is not available for bokking");
                alert.showAndWait();
            }

        });
    }



    @Deprecated
    void editSearchOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(GuestControllerIfNotSignIn.class.getResource("guestViewIfNotSignIn.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void joinOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GuestControllerIfNotSignIn.class.getResource("joinView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.show();

    }

    @FXML
    void signInOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GuestControllerIfNotSignIn.class.getResource("receptionistSignInViewIfJoined.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.show();
    }

}