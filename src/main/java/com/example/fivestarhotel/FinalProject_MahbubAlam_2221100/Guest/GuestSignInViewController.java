package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import com.example.fivestarhotel.Utility.DataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class GuestSignInViewController {
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private TextField memeberIDTextField;

    @javafx.fxml.FXML
    public void signInSameView(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(GuestSignInViewController.class.getResource("guestSignInViewIfJoined.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setTitle("Join");
        newStage.setScene(scene);
        newStage.show();
    }

    @javafx.fxml.FXML
    public void signInOnAction(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        String guestId = memeberIDTextField.getText().trim();
        String password = passwordTextField.getText().trim();
        List<Guest> guestsList = DataManager.getObject("Guest.bin");
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error Dialog");
        alert.setHeaderText("Error");
        String username;
        String userId;

        for(Guest guest: guestsList){
            if(guest.isRegistered()){
                if(guest.getUserId().equals(guestId) && guest.getPassword().equals(password)){
                    userId = guest.getUserId();
                    username = guest.getName();
                    FXMLLoader fxmlLoader =  new FXMLLoader(GuestSignInViewController.class.getResource("profileView.fxml"));;
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
                    newStage.setScene(scene);
                    profileViewController nextController = fxmlLoader.getController();
                    nextController.receiveInformation(userId, username);
                    newStage.show();
                } else {
                    alert.setContentText("User Id and Password does not match");
                    alert.showAndWait();
                }
            }else {
                alert.setContentText("You must registered first to sign in");
                alert.showAndWait();

            }
        }


    }

    @javafx.fxml.FXML
    public void joinOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(GuestSignInViewController.class.getResource("joinView.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setTitle("Join");
        newStage.setScene(scene);
        newStage.show();
    }
}
