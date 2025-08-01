package cse213.final_project_2231379;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class ViewAttendenesRecodsController
{
    @javafx.fxml.FXML
    private TableColumn<Attendance,LocalTime> inCol;
    @javafx.fxml.FXML
    private TableColumn<Attendance, LocalTime> outCol;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Attendance,String> departmentCol;
    @javafx.fxml.FXML
    private TextField staffIdTextField;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Attendance,String> staffIdCol;
    @javafx.fxml.FXML
    private ComboBox<String> sortCombo;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<Attendance, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<Attendance,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<Attendance,String> nameCol;
    @javafx.fxml.FXML
    private ComboBox<String> dpartmentCombo;
    @javafx.fxml.FXML
    private TableView<Attendance> attendencestableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void resetOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void applyFilterOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboradOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportCSVOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void OderOnAction(ActionEvent actionEvent) {
    }
}