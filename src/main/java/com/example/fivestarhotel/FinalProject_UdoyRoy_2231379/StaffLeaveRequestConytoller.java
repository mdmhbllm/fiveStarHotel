package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class StaffLeaveRequestConytoller
{
    @javafx.fxml.FXML
    private TableColumn<LeaveReaquest, LocalDate> fromCol;
    @javafx.fxml.FXML
    private TableColumn<LeaveReaquest,String> reasonCol;
    @javafx.fxml.FXML
    private TableColumn<LeaveReaquest,String> requestIdCol;
    @javafx.fxml.FXML
    private TextArea rejectionReasonTextArea;
    @javafx.fxml.FXML
    private TableView<LeaveReaquest> tableView;
    @javafx.fxml.FXML
    private TableColumn<LeaveReaquest,LocalDate> toCol;
    @javafx.fxml.FXML
    private TableColumn<LeaveReaquest,String> statusCol;
    @javafx.fxml.FXML
    private ComboBox<String> statusCombo;

ArrayList<LeaveReaquest> requests = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        statusCombo.getItems().addAll("Pending", "Rejected", "Approved");

        requestIdCol.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        fromCol.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        toCol.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        reasonCol.setCellValueFactory(new PropertyValueFactory<>("reason"));

        if (requests.isEmpty()) {
            requests.add(new LeaveReaquest("REQ001", LocalDate.of(2025, 8, 20), LocalDate.of(2025, 8, 25), "Pending", "Family emergency"));
            requests.add(new LeaveReaquest("REQ002", LocalDate.of(2025, 9, 1), LocalDate.of(2025, 9, 3), "Pending", "Medical appointment"));
            requests.add(new LeaveReaquest("REQ003", LocalDate.of(2025, 9, 10), LocalDate.of(2025, 9, 12), "Pending", "Personal reason"));
            requests.add(new LeaveReaquest("REQ004", LocalDate.of(2025, 9, 15), LocalDate.of(2025, 9, 16), "Pending", "Travel plan"));
        }
        tableView.getItems().addAll(requests);



    }










    @javafx.fxml.FXML
    public void rejectOnAction(ActionEvent actionEvent) {
        LeaveReaquest leaveRequest = tableView.getSelectionModel().getSelectedItem();

        if (leaveRequest == null) {
            ShowAlert("Select in tableView");
        }

        if (leaveRequest.getStatus().equals("Pending")) {
            leaveRequest.setStatus("Rejected");
        }else {
            ShowAlert("Request rejected");
        }


        tableView.getItems().add(leaveRequest);



    }



    @javafx.fxml.FXML
    public void backToDashboradOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("dashboradForUser6HRManager.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }



    @javafx.fxml.FXML
    public void ApproveOnAction(ActionEvent actionEvent) {
        LeaveReaquest leaveRequest = tableView.getSelectionModel().getSelectedItem();

        if (leaveRequest != null) {
            ShowAlert("Select in tableView");
        }

        if (leaveRequest.getStatus().equals("Pending")) {
            leaveRequest.setStatus("Approved");
        }else {
            ShowAlert("Request Approved");
        }

        tableView.getItems().add(leaveRequest);



    }


    @javafx.fxml.FXML
    public void SearchOnAction(ActionEvent actionEvent) {
        ArrayList<LeaveReaquest> Filter = new ArrayList<>();

        String filter = statusCombo.getValue();

        for (LeaveReaquest r : requests) {
            if (r.getStatus().equals(filter)) {
                Filter.add(r);
            }
            tableView.getItems().clear();
            tableView.getItems().addAll(Filter);
        }




    }

    public void ShowAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(message);
        alert.showAndWait();
    }
}