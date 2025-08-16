package com.example.fivestarhotel;

import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel.Hotel;
import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Utility.DataManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.List;

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