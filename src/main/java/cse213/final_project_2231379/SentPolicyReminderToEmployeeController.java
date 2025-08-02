package cse213.final_project_2231379;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class SentPolicyReminderToEmployeeController
{
    @javafx.fxml.FXML
    private TableColumn<Policy,String> messageCol;
    @javafx.fxml.FXML
    private TableColumn<Policy,String> titleCol;
    @javafx.fxml.FXML
    private TextArea meaasageTextArea;
    @javafx.fxml.FXML
    private TextField referenceLinkTextField;
    @javafx.fxml.FXML
    private TableColumn<Policy,String> policyIdCol;
    @javafx.fxml.FXML
    private TableView<Policy> tableView;
    @javafx.fxml.FXML
    private TableColumn<Policy,String> linkCol;
    @javafx.fxml.FXML
    private TextField policytitleTextField;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<Policy, LocalDate> sentDateCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void clearFormOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboradOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sentReminderToAllOnAction(ActionEvent actionEvent) {
    }
}