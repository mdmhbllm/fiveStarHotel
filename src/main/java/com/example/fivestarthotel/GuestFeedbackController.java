package com.example.fivestarthotel.GeneralManager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class GuestFeedbackController
{
    @javafx.fxml.FXML
    private TableColumn guestTypeCol;
    @javafx.fxml.FXML
    private TableColumn guestIdCol;
    @javafx.fxml.FXML
    private TableColumn GuestNameCol;
    @javafx.fxml.FXML
    private TableColumn RoomNumberCol;
    @javafx.fxml.FXML
    private ComboBox guestTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn ratingScoreCol;
    @javafx.fxml.FXML
    private Label guestFeedbackL;
    @javafx.fxml.FXML
    private TableView guestTableView;
    @javafx.fxml.FXML
    private TableColumn feedBackCol;
    @javafx.fxml.FXML
    private TextField ratingTF;
    @javafx.fxml.FXML
    private TextField guestTF;
    @javafx.fxml.FXML
    private TextField roomNoTF;
    @javafx.fxml.FXML
    private Text feedbackCommentTA;
    @javafx.fxml.FXML
    private TextArea feedbackComTA;
    @javafx.fxml.FXML
    private TextField guestNamTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void returnToDashboardOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void filterOA(ActionEvent actionEvent) {
    }
}