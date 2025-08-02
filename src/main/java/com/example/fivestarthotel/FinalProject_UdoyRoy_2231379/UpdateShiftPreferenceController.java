package com.example.fivestarthotel.FinalProject_UdoyRoy_2231379;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class UpdateShiftPreferenceController
{
    @javafx.fxml.FXML
    private CheckBox wedCheckbox;
    @javafx.fxml.FXML
    private ComboBox<String> roleCombo;
    @javafx.fxml.FXML
    private ComboBox<String> depertmentCombo;
    @javafx.fxml.FXML
    private CheckBox tuesCheckBox;
    @javafx.fxml.FXML
    private ComboBox<String> preferredShiftCombo;
    @javafx.fxml.FXML
    private CheckBox sCheckbox;
    @javafx.fxml.FXML
    private CheckBox sunCheckBox;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private CheckBox fridayCheckBox;
    @javafx.fxml.FXML
    private TableView<Employee> tableView;
    @javafx.fxml.FXML
    private TableColumn<Employee,Integer> employeeIdCol;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextArea notesTextArea;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> shiftCol;
    @javafx.fxml.FXML
    private CheckBox thurCheckBox;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> depertmentCol;
    @javafx.fxml.FXML
    private CheckBox monCheckbox;
    @javafx.fxml.FXML
    private TextField empolyeeiDtextField;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> roleCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveAndAddOnAction(ActionEvent actionEvent) {
    }
}