package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class GuestFeedbackController {

    @FXML
    private ComboBox<String> guestTypeCB;

    @FXML
    private ComboBox<Integer> ratingCB;

    @FXML
    private TableView<GuestFeedback> feedbackTV;

    @FXML
    private TableColumn<GuestFeedback, Integer> guestIdCol;

    @FXML
    private TableColumn<GuestFeedback, String> nameCol;

    @FXML
    private TableColumn<GuestFeedback, Integer> roomNOCol;

    @FXML
    private TableColumn<GuestFeedback, String> guestCol;

    @FXML
    private TableColumn<GuestFeedback, String> feedbackCMCol;

    @FXML
    private TableColumn<GuestFeedback, Float> starRatingCol;

    @FXML
    private Label guestFeedbackL;

    private ObservableList<GuestFeedback> masterData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        guestTypeCB.setItems(FXCollections.observableArrayList("VIP", "Regular"));
        ratingCB.setItems(FXCollections.observableArrayList(1, 2, 3, 4, 5));

        guestIdCol.setCellValueFactory(new PropertyValueFactory<>("guestId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        roomNOCol.setCellValueFactory(new PropertyValueFactory<>("roomNo"));
        guestCol.setCellValueFactory(new PropertyValueFactory<>("guestType"));
        feedbackCMCol.setCellValueFactory(new PropertyValueFactory<>("comments"));
        starRatingCol.setCellValueFactory(new PropertyValueFactory<>("starRating"));

        feedbackTV.setItems(masterData);

        feedbackTV.setRowFactory(tv -> new TableRow<>() {
            @Override
            protected void updateItem(GuestFeedback item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setStyle("");
                } else if (item.getStarRating() <= 2.0f) {
                    setStyle("-fx-background-color: #FFB6B6;"); // Light red
                } else {
                    setStyle("");
                }
            }
        });
    }

    public void setFeedbackData(ObservableList<GuestFeedback> feedbackData) {
        masterData.setAll(feedbackData);
    }

    @FXML
    public void filterOA(ActionEvent actionEvent) {
        ObservableList<GuestFeedback> filteredData = FXCollections.observableArrayList(masterData);

        String selectedType = guestTypeCB.getValue();
        if (selectedType != null && !selectedType.isEmpty()) {
            filteredData.removeIf(f -> !f.getGuestType().equalsIgnoreCase(selectedType));
        }

        Integer selectedRating = ratingCB.getValue();
        if (selectedRating != null) {
            float rating = selectedRating.floatValue();
            filteredData.removeIf(f -> f.getStarRating().floatValue() != rating);
        }

        feedbackTV.setItems(filteredData);
    }

    @FXML
    public void logoutOA(ActionEvent actionEvent) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/LoginView.fxml");
    }

    @FXML
    public void backOA(ActionEvent actionEvent) {
        switchScene("/com/example/fivestarhotel/FinalProject_RaziaSultana_2210915/GeneralManager/GeneralManagerDashboard.fxml");
    }

    private void switchScene(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();
            Stage stage = getStage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Stage getStage() {
        return (Stage) feedbackTV.getScene().getWindow();
    }
}
