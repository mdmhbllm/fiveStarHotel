package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboradForUser6HRManagerController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sentPolicyReminderOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("sentPolicyReminderToEmployee.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }

    @javafx.fxml.FXML
    public void viewAttendanceReportOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("viewAttendenesRecods.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();



    }

    @javafx.fxml.FXML
    public void viewTrainingRequestOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("EmployeeTrainingRequests.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();



    }

    @Deprecated
    public void managePoliciesOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ShiftPreferencesOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("updateShiftPreference.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }

    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void exportAttendanceOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateTurnoverReport(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("turnoverRepot.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }

    @javafx.fxml.FXML
    public void registerBenefitOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("benefitProgramReister.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }

    @javafx.fxml.FXML
    public void announceEmployeeRecognitionEvent(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("employeeRecognitionEvent.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();



    }

    @javafx.fxml.FXML
    public void approveStaffLeaveRequest(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("staffLeaveRequest.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();



    }
}