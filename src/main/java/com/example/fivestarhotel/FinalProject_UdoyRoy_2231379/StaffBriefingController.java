package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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


public class StaffBriefingController
{
    @FXML
    private ComboBox<String> locationCombo;
    @FXML
    private DatePicker briefingDatePicker;
    @FXML
    private Label messageLabel;
    @FXML
    private TextArea agendaTextArea;
    @FXML
    private ComboBox<String> timeCombo;
    @FXML
    private TableColumn<Briefing,String> locationCol;
    @FXML
    private TableColumn<Briefing,LocalDate> dateCol;
    @FXML
    private TableColumn<Briefing,String> agendaCol;
    @FXML
    private TableColumn<Briefing,String> timeCol;
    @FXML
    private TableView<Briefing> staffBriefingTableView;

    ArrayList <Briefing> staffBriefing = new ArrayList <>();

    public void initialize() throws IOException {
        locationCombo.getItems().addAll("Conference Room A", "Main Hall", "Staff Lounge");
        timeCombo.getItems().addAll("10:00", "11:00", "12:00", "13:00", "14:00");




        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        agendaCol.setCellValueFactory(new PropertyValueFactory<>("agenda"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));


         File file = new File("StaffBriefing.bin");

             if (!file.exists()) {
                             return;
                        }

             FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis);


             try {
                 while(true) {
                     Briefing bf = (Briefing) ois.readObject();
                     staffBriefing.add(bf);
                 }
             }catch(EOFException eof){
                 System.out.println("EOF");
             }catch (ClassNotFoundException enf) {
                 System.out.println("Class not found");
             }

             staffBriefingTableView.getItems().addAll(staffBriefing);




    }

    @FXML
    public void clearOnAction(ActionEvent actionEvent) {
        briefingDatePicker.setValue(null);
        timeCombo.getSelectionModel().clearSelection();
        agendaTextArea.clear();
        locationCombo.getSelectionModel().clearSelection();
        messageLabel.setText("");




    }

    @FXML
    public void backToDashBoradOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("restaurentManager.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    public void annouceBriefingOnAction  (ActionEvent actionEvent) throws IOException {



        if (briefingDatePicker.getValue() == null) {
            messageLabel.setText("Please select a briefing date");
            return;
        }
        if (briefingDatePicker.getValue().isBefore(LocalDate.now())) {
            messageLabel.setText("please select future date");
            return;

        }
        if (timeCombo.getValue() == null) {
            messageLabel.setText("Please select a time");
            return;
        }
        if (locationCombo.getValue() == null) {
            messageLabel.setText("Please select a location");
            return;
        }
        if (agendaTextArea.getText() == null) {
            messageLabel.setText("Write  Agenda for briefing");
            return;
        }

        LocalDate dates = briefingDatePicker.getValue();
        String times = timeCombo.getValue();
        String agendas = agendaTextArea.getText();
        String locations = locationCombo.getValue();



        Briefing b = new Briefing(dates,times,agendas,locations);



        File file = new File("staffBriefing.bin");

        FileOutputStream fos;
        ObjectOutputStream oos;

        if (file.exists()) {
            fos = new FileOutputStream(file,true);
            oos = new appendableObjectOutputStream(fos);
        }else {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
        }
        oos.writeObject(b);
        oos.close();
        staffBriefing.add(b);
        messageLabel.setText("Briefing Added");


        staffBriefingTableView.getItems().clear();
        staffBriefingTableView.getItems().add(b);





    }


}