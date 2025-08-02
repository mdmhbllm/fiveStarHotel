package cse213.final_project_2231379;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class EmployeeTrainingRequestsController
{
    @javafx.fxml.FXML
    private TableColumn<TraringRequest,String> titleCol;
    @javafx.fxml.FXML
    private ComboBox<String> StatusCombo;
    @javafx.fxml.FXML
    private TableColumn<TraringRequest,String> requestIdCol;
    @javafx.fxml.FXML
    private TableView<TraringRequest> tableView;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private ComboBox<String> filterTypeCombo;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextArea rejectReasonTextArea;
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TableColumn<TraringRequest,String> employeeNameCol;
    @javafx.fxml.FXML
    private TableColumn<TraringRequest, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<TraringRequest,String> statusCol;
    @javafx.fxml.FXML
    private DatePicker filterDatePicker;
    @javafx.fxml.FXML
    private Button backToDashBoradOnAction;
    @javafx.fxml.FXML
    private TextField employeeNameTextField;
    @javafx.fxml.FXML
    private TextField requestIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void rejectOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveDataOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveOnAction(ActionEvent actionEvent) {
    }
}