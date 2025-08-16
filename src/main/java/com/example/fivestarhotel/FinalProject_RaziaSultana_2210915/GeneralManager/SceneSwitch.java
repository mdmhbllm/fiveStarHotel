package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import com.example.fivestarhotel.fiveStarHotelMainApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitch extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(fiveStarHotelMainApplication.class.getResource("FinalProject_RaziaSultana_2210915/GeneralManager/GeneralManagerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Five Star Hotel");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}