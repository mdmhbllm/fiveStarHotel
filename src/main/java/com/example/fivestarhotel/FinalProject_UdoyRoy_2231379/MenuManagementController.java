package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class MenuManagementController
{
    @javafx.fxml.FXML
    private TextField ScearchTextField;
    @javafx.fxml.FXML
    private Label currentPriceLabel;
    @javafx.fxml.FXML
    private Button viewMenu;
    @javafx.fxml.FXML
    private TextField newPriceTextField;
    @javafx.fxml.FXML
    private Label lastUpdateLabel;
    @javafx.fxml.FXML
    private TableColumn<MenuItem,String> categoryCol;
    @javafx.fxml.FXML
    private ComboBox<String> categoryTextField;
    @javafx.fxml.FXML
    private TableColumn<MenuItem,Double> priceCol;
    @javafx.fxml.FXML
    private TableColumn<MenuItem,String> itemIdCol;
    @javafx.fxml.FXML
    private TextField itemIdTextField;
    @javafx.fxml.FXML
    private TableView<MenuItem> menuTableView;
    @javafx.fxml.FXML
    private TableColumn<MenuItem,String> nameCol;
    @javafx.fxml.FXML
    private TextField nameTextFied;
    @javafx.fxml.FXML
    private ComboBox<String> categoryFilterCombo;
    @javafx.fxml.FXML
    private TableColumn<MenuItem, LocalDate> lastUpdateCol;
    @javafx.fxml.FXML
    private DatePicker lastUpdateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateMenuOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewMenuOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboradOnAcion(ActionEvent actionEvent) {
    }
}