package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.GeneralManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class MonitorRoomOccupancyController {

    @javafx.fxml.FXML
    private TableView<MonitorRoomOccupancy> roomViewTV;
    @javafx.fxml.FXML
    private TableColumn<MonitorRoomOccupancy, String> roomNumberCol;
    @javafx.fxml.FXML
    private TableColumn<MonitorRoomOccupancy, Integer> upcomingRoomCol;
    @javafx.fxml.FXML
    private TableColumn<MonitorRoomOccupancy, String> availableRoomByTypeCol;
    @javafx.fxml.FXML
    private TableColumn<MonitorRoomOccupancy, Double> availableDailyRateCol;
    @javafx.fxml.FXML
    private ComboBox<String> roomTypeCB;
    @javafx.fxml.FXML
    private DatePicker dateRangeDP;
    @javafx.fxml.FXML
    private Label monitorRoomOccupancyL;

    private ObservableList<MonitorRoomOccupancy> allData = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        roomNumberCol.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("roomNumber"));
        upcomingRoomCol.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("upcomingBookingsForecast"));
        availableRoomByTypeCol.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("roomType"));
        availableDailyRateCol.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("averageDailyRate"));

        roomTypeCB.setItems(FXCollections.observableArrayList("All", "Standard", "Deluxe", "Suite"));
        roomTypeCB.getSelectionModel().selectFirst();

        loadSampleData();

        roomViewTV.setItems(allData);
    }

    private void loadSampleData() {
        allData.addAll(
                new MonitorRoomOccupancy("101", "Standard", 2, 5, 120.0),
                new MonitorRoomOccupancy("102", "Deluxe", 1, 2, 200.0),
                new MonitorRoomOccupancy("201", "Suite", 0, 1, 350.0),
                new MonitorRoomOccupancy("202", "Standard", 3, 4, 130.0),
                new MonitorRoomOccupancy("301", "Deluxe", 2, 3, 220.0),
                new MonitorRoomOccupancy("401", "Suite", 1, 2, 400.0)
        );
    }

    @javafx.fxml.FXML
    public void updateViewOA(ActionEvent actionEvent) {
        String selectedRoomType = roomTypeCB.getValue();
        LocalDate selectedDate = dateRangeDP.getValue(); // currently unused for sample data

        List<MonitorRoomOccupancy> filtered = allData.stream()
                .filter(room -> selectedRoomType.equals("All") || room.getRoomType().equals(selectedRoomType))
                .collect(Collectors.toList());

        roomViewTV.setItems(FXCollections.observableArrayList(filtered));
    }

    @javafx.fxml.FXML
    public void generateReportOA(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Occupancy Report");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV Files", "*.csv"));

        Stage stage = (Stage) roomViewTV.getScene().getWindow();
        var file = fileChooser.showSaveDialog(stage);

        if (file != null) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Room Number,Upcoming Bookings,Room Type,Available Rooms,Average Daily Rate\n");
                for (MonitorRoomOccupancy room : roomViewTV.getItems()) {
                    writer.write(String.format("%s,%d,%s,%d,%.2f\n",
                            room.getRoomNumber(),
                            room.getUpcomingBookingsForecast(),
                            room.getRoomType(),
                            room.getAvailableRooms(),
                            room.getAverageDailyRate()));
                }
                showAlert(Alert.AlertType.INFORMATION, "Report Saved", "Occupancy report saved successfully.");
            } catch (IOException e) {
                showAlert(Alert.AlertType.ERROR, "Error", "Could not save report: " + e.getMessage());
            }
        }
    }

    @javafx.fxml.FXML
    public void logOutOA(ActionEvent actionEvent) {
        showAlert(Alert.AlertType.INFORMATION, "Logout", "You have been logged out successfully.");
        // TODO: implement scene switch back to login
    }

    private void showAlert(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
