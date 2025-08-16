package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;


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
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TableColumn<TraringRequest,String> employeeNameCol;
    @javafx.fxml.FXML
    private TableColumn<TraringRequest, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<TraringRequest,String> statusCol;
    @javafx.fxml.FXML
    private Button backToDashBoradOnAction;
    @javafx.fxml.FXML
    private TextField employeeNameTextField;
    @javafx.fxml.FXML
    private TextField requestIdTextField;
    @javafx.fxml.FXML
    private TableColumn<TraringRequest,String> typeCol;
    @javafx.fxml.FXML
    private ComboBox<String> trainingTypeCombo;

    ArrayList<TraringRequest> trainingRequests = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() throws IOException{
        StatusCombo.getItems().addAll("Pending", "In Progress");
        trainingTypeCombo.getItems().addAll("All", "Safety", "Service", "Technical", "Customer Service", "Leadership", "Communication Skills", "Compliance", "Health & Wellness", "IT & Software");


        requestIdCol.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        employeeNameCol.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("trainingTitle"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));


        File file = new File("TrainingR.bin");

        if (!file.exists()) {
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            while (true){
                TraringRequest t = (TraringRequest) ois.readObject();
                trainingRequests.add(t);
            }
        }catch(EOFException eof){
            System.out.println("EOF");
        }catch (ClassNotFoundException enf){
            System.out.println("Class not found");
        }

        tableView.getItems().addAll(trainingRequests);

    }



    @javafx.fxml.FXML
    public void addOnTableView(ActionEvent actionEvent) throws IOException {

        if (requestIdTextField.getText().isEmpty()) {
            messageLabel.setText("Please enter request ID");
            return;
        }

       if (trainingTypeCombo.getValue() == null) {
           messageLabel.setText("Please select training type");
           return;
       }

       if(titleTextField.getText().isEmpty()) {
           messageLabel.setText("Please enter title");
           return;
       }
       if (datePicker.getValue() == null) {
           messageLabel.setText("Please enter date");
           return;
       }
       if (employeeNameTextField.getText().isEmpty()) {
           messageLabel.setText("Please enter employee name");
           return;
       }
       if(StatusCombo.getValue() == null) {
           messageLabel.setText("Please select status");
           return;
       }






       String id = requestIdTextField.getText();
       String name = employeeNameTextField.getText();
       String title = titleTextField.getText();
       LocalDate date = datePicker.getValue();
       String status = StatusCombo.getValue();
       String type = trainingTypeCombo.getValue();


       TraringRequest request = new TraringRequest(id, name, title, date, status, type);

        trainingRequests.add(request);



       File file = new File("TrainingR.bin");

       FileOutputStream fos;
       ObjectOutputStream oos;

       if (file.exists()) {
           fos = new FileOutputStream(file,true);
           oos = new appendableObjectOutputStream(fos);
       }else {
           fos = new FileOutputStream(file);
           oos = new ObjectOutputStream(fos);
       }
       oos.writeObject(request);
       oos.close();
       messageLabel.setText("Training request added");


       tableView.getItems().addAll(trainingRequests);





}

    @javafx.fxml.FXML
    public void refreshOnAction(ActionEvent actionEvent) {
requestIdTextField.clear();
employeeNameTextField.clear();
titleTextField.clear();
datePicker.setValue(null);
trainingTypeCombo.setValue(null);
StatusCombo.setValue(null);



    }

    @javafx.fxml.FXML
    public void approveOnAction(ActionEvent actionEvent) {
        TraringRequest SelectedRequest = tableView.getSelectionModel().getSelectedItem();

        if (SelectedRequest == null) {
            messageLabel.setText("Please select request");
            return;
        }
        if (SelectedRequest.getStatus().equals("Pending")) {
            SelectedRequest.setStatus("Approved");
        }
        else{
            SelectedRequest.setStatus("Approved");
        }

        tableView.getItems().add(SelectedRequest);



    }

    @javafx.fxml.FXML
    public void backOnDashboradOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("dashboradForUser6HRManager.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();



    }


}