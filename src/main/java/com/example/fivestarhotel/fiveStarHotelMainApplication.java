package com.example.fivestarhotel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class fiveStarHotelMainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(fiveStarHotelMainApplication.class.getResource("FinalProject_MahbubAlam_2221100/Guest/guestViewIfNotSignIn.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Five Star Hotel");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException {
        launch();
    }

}