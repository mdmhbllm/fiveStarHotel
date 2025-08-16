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

public class GuestFeedBackController {
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Feedback, String> feedbackTextCol;
    @javafx.fxml.FXML
    private TableColumn<Feedback, LocalDate> subDateCol;
    @javafx.fxml.FXML
    private TableColumn<Feedback, String> satusCol;
    @javafx.fxml.FXML
    private TableColumn<Feedback, Integer> ratingCol;
    @javafx.fxml.FXML
    private Label message;
    @javafx.fxml.FXML
    private TextField guestNameTextField;
    @javafx.fxml.FXML
    private TableView<Feedback> feedbackTableView;
    @javafx.fxml.FXML
    private TableColumn<Feedback, String> gueastNameCol;
    @javafx.fxml.FXML
    private TableColumn<Feedback, String> feedbackIDCol;
    @javafx.fxml.FXML
    private ComboBox<String> ratingCombo;

ArrayList<Feedback> feedbacks = new ArrayList<>();


    public void initialize()  throws IOException {
        ratingCombo.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9");


        feedbackIDCol.setCellValueFactory(new PropertyValueFactory<>("feedbackId"));
        gueastNameCol.setCellValueFactory(new PropertyValueFactory<>("guestName"));
        subDateCol.setCellValueFactory(new PropertyValueFactory<>("submissionDate"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("rating"));
        satusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        feedbackTextCol.setCellValueFactory(new PropertyValueFactory<>("feedbackText"));


        if(feedbacks.isEmpty()) {
            feedbacks.add(new Feedback("FB001", "John Doe", LocalDate.now().minusDays(1), 5, "Great service!", "Pending"));
            feedbacks.add(new Feedback("FB002", "Jane Smith", LocalDate.now(), 4, "Good food but slow service.", "Pending"));
            feedbacks.add(new Feedback("FB003", "Alex", LocalDate.now().minusDays(3), 3, "Average experience.", "Rejected"));
        }
        feedbackTableView.getItems().addAll(feedbacks);

        File file = new File("feedback.bin");

        if (file.exists()) {
            return;
        }

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try{
            while (true){
                Feedback feedback = (Feedback) ois.readObject();
                feedbacks.add(feedback);

            }
        }catch(EOFException eof){
            System.out.println("Error reading feedback");
        }catch (ClassNotFoundException enf){
            System.out.println("Error reading feedback");
        }
        feedbackTableView.getItems().clear();
        //feedbackTableView.getItems().addAll(feedbacks);



    }


    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {

        guestNameTextField.clear();
        ratingCombo.setValue(null);
        fromDatePicker.setValue(null);

    }

    @javafx.fxml.FXML
    public void backtoDashBoradOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("restaurentManager.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();



    }

    @javafx.fxml.FXML
    public void filterOnAction(ActionEvent actionEvent) {
        ArrayList<Feedback> filteredFeedbacks = new ArrayList<>();

        String guestName = guestNameTextField.getText();
        String rating = ratingCombo.getValue();
        LocalDate submissionDate = fromDatePicker.getValue();


        for (Feedback f : feedbacks) {
            if (f.getGuestName().equals(guestName) || rating.equals(f.getRating()) || submissionDate.equals(f.getSubmissionDate())) {
                filteredFeedbacks.add(f);

            }
            feedbackTableView.getItems().clear();
            feedbackTableView.getItems().addAll(filteredFeedbacks);
        }




    }

    @javafx.fxml.FXML
    public void approveOnAction(ActionEvent actionEvent)  throws IOException {
        Feedback selected = feedbackTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            message.setText("Please select a feedback first.");
            return;
        }
        if (selected.getStatus().equals("Pending")) {
            selected.setStatus("Accepted");


            message.setText("Feedback approved successfully.");

            //feedbackTableView.getItems().add(selected);

        }else {
            message.setText("This feedback is already processed.");
        }

        File file = new File("feedback.bin");

        FileOutputStream fos;
        ObjectOutputStream oos;

        if (file.exists()) {
            fos = new FileOutputStream(file,true);
            oos = new appendableObjectOutputStream(fos);
        }else{
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
        }
        oos.writeObject(selected);
        oos.close();

        feedbackTableView.getItems().add(selected);
    }



    }
