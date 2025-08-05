package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class BenefitProgramReisterController
{
    @javafx.fxml.FXML
    private TableColumn<Benefit,String> typeCol;
    @javafx.fxml.FXML
    private ComboBox<String> benefitTypeCombo;
    @javafx.fxml.FXML
    private TextField dependentCombo;
    @javafx.fxml.FXML
    private TableView<Benefit> registerBenefitTableView;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TextField benefitIdTextField;
    @javafx.fxml.FXML
    private TableColumn<Benefit,String> dependents;
    @javafx.fxml.FXML
    private TableColumn<Benefit,String> benefitIdCol;
    @javafx.fxml.FXML
    private TableColumn<Benefit, LocalDate> StartDateCol;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField employeeIdTextField;
    @javafx.fxml.FXML
    private TableColumn<Benefit,String> emoployeeIdCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnDashboradOnAction(ActionEvent actionEvent) {
    }
}