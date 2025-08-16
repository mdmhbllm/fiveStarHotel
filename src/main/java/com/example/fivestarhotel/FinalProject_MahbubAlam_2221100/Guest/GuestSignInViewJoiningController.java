package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class GuestSignInViewJoiningController {
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private TextField memberIDTextField;
    @javafx.fxml.FXML
    private Label memberNameDisplay;
    @javafx.fxml.FXML
    private Label memberIdNumberDisplay;

    private String UserPassword;
    private String memberId;
    private String memberName;

    public static String guestID;

    @javafx.fxml.FXML
    public void memberSignInOnAction(ActionEvent actionEvent) throws IOException {
        if(memberId.equals(memberIDTextField.getText().trim())
                && UserPassword.equals(passwordTextField.getText().trim())){

            FXMLLoader fxmlLoader =  new FXMLLoader(GuestSignInViewJoiningController.class.getResource("guestViewIfSignIn.fxml"));;
            Scene scene = new Scene(fxmlLoader.load());
            Stage newStage = (Stage)( ((Node)actionEvent.getSource()).getScene().getWindow() );
            newStage.setScene(scene);

            GuestControllerIfSignIn nextController = fxmlLoader.getController();
            nextController.getinformation(memberName);

            newStage.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Error");
            alert.setContentText("UserId and password does not match");
            alert.showAndWait();
        }

    }

    @javafx.fxml.FXML
    public void joinOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(GuestSignInViewJoiningController.class.getResource("joinView.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setTitle("Join");
        newStage.setScene(scene);
        newStage.show();
    }

    @javafx.fxml.FXML
    public void sisignInOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(GuestSignInViewJoiningController.class.getResource("receptionistSignInViewIfJoined.fxml"));;
        Scene scene = new Scene(fxmlLoader.load());
        Stage newStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        newStage.setTitle("Sign In");
        newStage.setScene(scene);
        newStage.show();
    }

    public void receiveInformation(String userId, String fullName, String password) {
        memberIdNumberDisplay.setText(userId);
        memberNameDisplay.setText(fullName);

        UserPassword = password;
        memberId = userId;
        memberName = fullName;
        guestID = userId;
    }
}
