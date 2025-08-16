package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Receptionist;

import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest.JoinController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistViewIfNotSignInController {
    @javafx.fxml.FXML
    private Label massage;


    @javafx.fxml.FXML
    public void signInOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(ReceptionistViewIfNotSignInController.class.getResource("receptionistSignInViewIfJoined.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setScene(scene);
        newStage.show();
    }

    @javafx.fxml.FXML
    public void joinHotelOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(ReceptionistViewIfNotSignInController.class.getResource("receptionistJoinView.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setScene(scene);
        newStage.show();
    }
}
