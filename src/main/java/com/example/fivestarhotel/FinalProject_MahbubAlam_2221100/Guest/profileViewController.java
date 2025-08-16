package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class profileViewController {
    @javafx.fxml.FXML
    private Label userIdDisPlay;
    @javafx.fxml.FXML
    private Label userNameDisplay;

    private String userIdForward;
    private String userNameForward;

    @javafx.fxml.FXML
    public void reviewOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(profileViewController.class.getResource("listOfRoomForReview.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setScene(scene);
        newStage.show();
    }

    @javafx.fxml.FXML
    public void ViewServiceOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(profileViewController.class.getResource("hotelServiceView.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setScene(scene);

        HotelServiceController nextController = fxmlLoader.getController();
        nextController.receiveInfo(userNameForward, userIdForward);
        newStage.show();
    }

    @javafx.fxml.FXML
    public void myBookingOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(profileViewController.class.getResource("myBookingListView.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setScene(scene);
        newStage.show();
    }

    @javafx.fxml.FXML
    public void manageAccountOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(profileViewController.class.getResource("manageAccountView.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setScene(scene);
        ManageAccountController nextController = fxmlLoader.getController();
        nextController.receiveInfo(userNameForward, userIdForward);
        newStage.show();
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(profileViewController.class.getResource("receptionistSignInViewIfJoined.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setScene(scene);
        newStage.show();
    }

    @javafx.fxml.FXML
    public void signOutOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(profileViewController.class.getResource("guestViewIfNotSignIn.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setScene(scene);
        newStage.show();
    }


    public void receiveInformation(String userId, String username) {
        userIdDisPlay.setText(userId);
        userNameDisplay.setText(username);
        userIdForward = userId;
        userNameForward = username;
    }
}
