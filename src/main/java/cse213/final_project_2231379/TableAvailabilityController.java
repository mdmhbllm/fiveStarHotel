package cse213.final_project_2231379;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class TableAvailabilityController
{
    @javafx.fxml.FXML
    private TableColumn<Table,String> typeCol;
    @javafx.fxml.FXML
    private TableColumn<Table,Integer> tableIdCol;
    @javafx.fxml.FXML
    private TableColumn<Table,String> statusCol;
    @javafx.fxml.FXML
    private ComboBox<String> typeFilterCombo;
    @javafx.fxml.FXML
    private TableView<Table> tableATableView;
    @javafx.fxml.FXML
    private TableColumn<Table,String> assignCol;
    @javafx.fxml.FXML
    private TextField partySizeTextField;
    @javafx.fxml.FXML
    private ComboBox<String> statusFilterCombo;
    @javafx.fxml.FXML
    private TableColumn<Table,Integer> capacityCol;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backToDashBoradOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SearchOnAction(ActionEvent actionEvent) {
    }
}