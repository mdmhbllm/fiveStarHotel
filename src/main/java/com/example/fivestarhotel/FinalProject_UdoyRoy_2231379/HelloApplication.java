package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("restaurentManager.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


//after run restaurentManager or dashboradForUser6HRManager change the FXMLLoader to dashboradForUser6HRManager or restaurentManager .fxml

//Sorry for to much spelling mistake