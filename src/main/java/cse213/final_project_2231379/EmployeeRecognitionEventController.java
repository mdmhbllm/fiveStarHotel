package cse213.final_project_2231379;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class EmployeeRecognitionEventController
{
    @javafx.fxml.FXML
    private TextField eventNameTextField;
    @javafx.fxml.FXML
    private TableColumn<RecognitionEvent,String> locationCol;
    @javafx.fxml.FXML
    private ComboBox<String> timeCombo;
    @javafx.fxml.FXML
    private TableColumn<RecognitionEvent, LocalDate> dateCol;
    @javafx.fxml.FXML
    private Label messageOnAction;
    @javafx.fxml.FXML
    private TableColumn<RecognitionEvent,String> purposeCol;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableView<RecognitionEvent> tableView;
    @javafx.fxml.FXML
    private TextArea purposeTextArea;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private TableColumn<RecognitionEvent, LocalTime> timeCol;
    @javafx.fxml.FXML
    private TableColumn<RecognitionEvent,String> eventNameCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboradOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void announceEventOnAction(ActionEvent actionEvent) {
    }
}