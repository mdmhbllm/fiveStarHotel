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
import java.util.ArrayList;

public class SentSpecialOfferToGuestController
{
    @FXML
    private TextField titleTextField;
    @FXML
    private DatePicker validDatePicker;
    @FXML
    private TextArea descriptionTextArea;
    @FXML
    private TextField filterOfferNoTextField;
    @FXML
    private TableView<SpecialOffer> offerTableView;
    @FXML
    private TableColumn<SpecialOffer,LocalDate> validUntilcol;
    @FXML
    private TableColumn<SpecialOffer,Integer> offerOnCol;
    @FXML
    private Label message;
    @FXML
    private TableColumn<SpecialOffer,String> offerTitle;
    @FXML
    private TableColumn<SpecialOffer,String> descriptionCol;


    ArrayList<SpecialOffer> offers = new ArrayList<>();
    @FXML
    private TextField OfferNoTextField;

    @FXML
    public void initialize() throws IOException{

        offerOnCol.setCellValueFactory(new PropertyValueFactory<>("offerId"));
        offerTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        validUntilcol.setCellValueFactory(new PropertyValueFactory<>("validUntil"));



        File file = new File("SpecialOffer.bin");
        if (!file.exists()) {
            return;
        }

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);


        try {
            while (true) {
                SpecialOffer sp = (SpecialOffer) ois.readObject();
                offers.add(sp);
            }
        }catch(EOFException eof){
            System.out.println("EOF");
        }catch (ClassNotFoundException enf) {
            System.out.println("Class not found");
        }

        offerTableView.getItems().addAll(offers);

    }

    @FXML
    public void clearOnAction(ActionEvent actionEvent) {
        titleTextField.clear();
        filterOfferNoTextField.clear();
        descriptionTextArea.clear();
        validDatePicker.setValue(null);




    }

    @FXML
    public void sentOfferOnAction(ActionEvent actionEvent) throws IOException {
        if (titleTextField.getText().isEmpty()) {
            message.setText("Please enter title");
            return;
        }
        if (validDatePicker.getValue() == null) {
            message.setText("Please enter valid date");
            return;
        }
        if(OfferNoTextField.getText().isEmpty()) {
            message.setText("Please enter filter offer no");
            return;
        }

        if(descriptionTextArea.getText().isEmpty()) {
            message.setText("Please enter description");
            return;
        }


        int offerNo = Integer.parseInt(OfferNoTextField.getText());
        String title = titleTextField.getText();
        LocalDate date = validDatePicker.getValue();
        String description = descriptionTextArea.getText();

        SpecialOffer offer = new SpecialOffer(offerNo, title, description, date);


        File file = new File("SpecialOffer.bin");

        FileOutputStream fos;
        ObjectOutputStream oos;


        if (file.exists()) {
            fos = new FileOutputStream(file,true);
            oos = new appendableObjectOutputStream(fos);
        }else {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
        }
        oos.writeObject(offer);
        oos.close();
        offers.add(offer);
        message.setText("Updated Price for ");
        //offerTableView.getItems().clear();
        offerTableView.getItems().addAll(offer);





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

    ArrayList<SpecialOffer> offerss = new ArrayList<>();

    @FXML
    public void SearchOnAction(ActionEvent actionEvent) {

        int OfferNumber = Integer.parseInt(filterOfferNoTextField.getText());


        if (filterOfferNoTextField.getText().isEmpty()) {
            message.setText("Please enter filter offer no");
            return;
        }

        offerTableView.getItems().clear();

        for (SpecialOffer offer : offers) {
            if (offer.getOfferId() == OfferNumber) {
                offerTableView.getItems().add(offer);
            }


        }

    }
}