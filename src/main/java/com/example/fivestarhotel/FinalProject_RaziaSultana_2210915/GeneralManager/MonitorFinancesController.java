package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class MonitorFinancesController {

    @javafx.fxml.FXML
    private TableView<MonitorFinances> monitorFinanceTV;
    @javafx.fxml.FXML
    private TableColumn<MonitorFinances, String> departmentBudgetCol;
    @javafx.fxml.FXML
    private TableColumn<MonitorFinances, Double> revenueCol;
    @javafx.fxml.FXML
    private TableColumn<MonitorFinances, Double> profitMarginCol;
    @javafx.fxml.FXML
    private ComboBox<String> departmentCB;
    @javafx.fxml.FXML
    private DatePicker datePK;
    @javafx.fxml.FXML
    private Label monitorFinanceL;

    private ObservableList<MonitorFinances> allData = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        departmentBudgetCol.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("departmentName"));
        revenueCol.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("revenue"));
        profitMarginCol.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("profitMargin"));

        departmentCB.setItems(FXCollections.observableArrayList("All", "F&B", "Rooms Division", "Housekeeping", "Front Office"));
        departmentCB.getSelectionModel().selectFirst();

        loadSampleData();

        monitorFinanceTV.setItems(allData);
    }

    private void loadSampleData() {
        allData.addAll(
                new MonitorFinances("F&B", 50000.0, 15000.0),
                new MonitorFinances("Rooms Division", 80000.0, 25000.0),
                new MonitorFinances("Housekeeping", 20000.0, 5000.0),
                new MonitorFinances("Front Office", 30000.0, 8000.0)
        );
    }

    @javafx.fxml.FXML
    public void applyOA(ActionEvent actionEvent) {
        String selectedDepartment = departmentCB.getValue();
        LocalDate selectedDate = datePK.getValue(); // currently unused in sample data

        List<MonitorFinances> filtered = allData.stream()
                .filter(record -> selectedDepartment.equals("All") || record.getDepartmentName().equals(selectedDepartment))
                .collect(Collectors.toList());

        monitorFinanceTV.setItems(FXCollections.observableArrayList(filtered));
    }

    @javafx.fxml.FXML
    public void logOutOA(ActionEvent actionEvent) {
        showAlert(Alert.AlertType.INFORMATION, "Logout", "You have been logged out successfully.");
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
        showAlert(Alert.AlertType.INFORMATION, "Back", "Returning to previous screen.");
    }

    private void showAlert(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
