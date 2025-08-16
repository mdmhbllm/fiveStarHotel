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
import java.time.LocalTime;
import java.util.ArrayList;

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

   ArrayList<RecognitionEvent> recognitionEvents = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() throws IOException{
        timeCombo.getItems().addAll("09:00", "11:00", "14:00", "16:00");



        eventNameCol.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        purposeCol.setCellValueFactory(new PropertyValueFactory<>("purpose"));


        File file = new File("recognitionEvent.bin");

        if(!file.exists()) {
            return;
        }

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try{
            while (true){
                RecognitionEvent re = (RecognitionEvent) ois.readObject();
                recognitionEvents.add(re);
            }
        }catch (EOFException eof){
            System.out.println("EOF");
        }catch (ClassNotFoundException enf){
            System.out.println("Class not found");
        }
tableView.getItems().clear();
tableView.getItems().addAll(recognitionEvents);


    }

    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
        eventNameTextField.clear();
        datePicker.setValue(null);
        timeCombo.setValue(null);
        locationTextField.clear();
        purposeTextArea.clear();
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
    public void announceEventOnAction(ActionEvent actionEvent) throws IOException {
        String name = eventNameTextField.getText();
        LocalDate date = datePicker.getValue();
        String timeString = timeCombo.getValue();
        String location = locationTextField.getText();
        String purpose = purposeTextArea.getText();


        if (name.isEmpty() || date == null || timeString == null || location.isEmpty() || purpose.isEmpty()) {
            messageOnAction.setText("⚠ Please fill all fields!");
            return;
        }

        LocalTime time = LocalTime.parse(timeString);


        RecognitionEvent newEvent = new RecognitionEvent(name, date, time, location, purpose);
        recognitionEvents.add(newEvent);


        File file = new File("recognitionEvent.bin");

        FileOutputStream fos;
        ObjectOutputStream oos;

        if (file.exists()) {
            fos = new FileOutputStream(file,true);
            oos = new appendableObjectOutputStream(fos);
        }else {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
        }
        oos.writeObject(newEvent);
        oos.close();

        tableView.getItems().add(newEvent);

    }
}