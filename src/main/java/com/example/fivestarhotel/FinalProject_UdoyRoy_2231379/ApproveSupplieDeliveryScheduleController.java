package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import java.util.Arrays;

public class ApproveSupplieDeliveryScheduleController {
    @FXML
    private TableColumn<DeliveryRequest, LocalDate> deliverydateCol;
    @FXML
    private TableColumn<DeliveryRequest, Integer> idCol;
    @FXML
    private DatePicker deliveryDateTextField;
    @FXML
    private TableColumn<DeliveryRequest, LocalTime> deliveryTime;
    @FXML
    private TableColumn<DeliveryRequest, String> supplierCol;
    @FXML
    private TextArea rejectionReasonTextArea;
    @FXML
    private TableColumn<DeliveryRequest, String> deliverystatusCol;
    @FXML
    private TableView<DeliveryRequest> deliveryTableView;
    @FXML
    private TableColumn<DeliveryRequest, String> actionCol;
    @FXML
    private TableColumn<DeliveryRequest, String> itemsCol;
    @FXML
    private ComboBox<String> statusFilterCombo;


    ArrayList<DeliveryRequest> deliveryRequests = new ArrayList<>();

    @FXML



    public void initialize() throws IOException {
        statusFilterCombo.getItems().addAll( "Pending", "Approved", "Rejected");


        idCol.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        supplierCol.setCellValueFactory(new PropertyValueFactory<>("supplierName"));
        deliverydateCol.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));
        deliveryTime.setCellValueFactory(new PropertyValueFactory<>("deliveryTime"));
        itemsCol.setCellValueFactory(new PropertyValueFactory<>("items"));
        deliverystatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        actionCol.setCellValueFactory(new PropertyValueFactory<>("rejectionReason"));


        if (deliveryRequests.isEmpty()) {
            deliveryRequests.add(new DeliveryRequest("01", "Shovo", LocalDate.now(), "2PM", "CHICKEN", "Pending", null));
            deliveryRequests.add(new DeliveryRequest("02", "Monir", LocalDate.now().minusDays(3), "3PM", "Mutton", "Pending", null));
            deliveryRequests.add(new DeliveryRequest("03", "Rafi", LocalDate.now().minusDays(4), "5PM", "Fish", "Pending", null));
            deliveryRequests.add(new DeliveryRequest("04", "Asif", LocalDate.now().minusDays(5), "7PM", "Drinks", "Pending", null));
            deliveryRequests.add(new DeliveryRequest("05", "Ayan", LocalDate.now().minusDays(6), "9PM", "Vegetables", "Pending", null));
            deliveryRequests.add(new DeliveryRequest("06", "Joy", LocalDate.now().minusDays(7), "11PM", "DessertItems", "Pending", null));
        }
        deliveryTableView.getItems().setAll(deliveryRequests);

        File file = new File("SuppliesItems");

        if (!file.exists()) {
            return;
        }

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);


        try {
        while (true)  {
            DeliveryRequest d = (DeliveryRequest) ois.readObject();
            deliveryRequests.add(d);
        }
        }catch (EOFException eof){
            System.out.println("EOF");
        }catch (ClassNotFoundException cnf){
            System.out.println("Class not found");
        }
        deliveryTableView.getItems().clear();



    }



    @FXML

    public void searchOnAction(ActionEvent actionEvent) {
        ArrayList<DeliveryRequest> filteredDeliveryRequests = new ArrayList<>();

        LocalDate deliveryDate = deliveryDateTextField.getValue();
        String Status = statusFilterCombo.getValue();

        if (deliveryDateTextField == null ){
            ShowAlert("Please enter a valid date");
        }
        if(Status == null ){
            ShowAlert("Please enter a valid status");
        }

        for (DeliveryRequest dr : deliveryRequests) {
            if (dr.getDeliveryDate().equals(deliveryDate) || dr.getStatus().equals(Status)) {
                filteredDeliveryRequests.add(dr);
            }
        }
        deliveryTableView.getItems().clear();
        deliveryTableView.getItems().addAll(filteredDeliveryRequests);




    }


    @FXML
    public void confirmRejectionOnAction(ActionEvent actionEvent) {
        DeliveryRequest Selected = deliveryTableView.getSelectionModel().getSelectedItem();

        if (Selected == null) {
            ShowAlert("Select Status");
            return;
        }

        if (Selected.getStatus().equals("Pending")) {
            Selected.setStatus("Rejected");

            deliveryTableView.refresh();

        }else {
            ShowAlert("Rejected");
        }


        deliveryTableView.getItems().add(Selected);





    }

    @FXML
    public void backToDashboradOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("restaurentManager.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    public void refreshOnAction(ActionEvent actionEvent) {
       deliveryDateTextField.setValue(null);
        statusFilterCombo.setValue(null);
    }


    @FXML
    public void approveOnAction(ActionEvent actionEvent) throws IOException {

        DeliveryRequest selected = deliveryTableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            ShowAlert("Please select a delivery first");
            return;
        }

        if (selected.getStatus().equals("Pending")) {
            selected.setStatus("Approved");
            deliveryTableView.refresh();

        }else {
            ShowAlert("Not approved");
        }




        File file = new File ("SuppliesItems.bin");




        FileOutputStream fos;
        ObjectOutputStream oos;


        if (file.exists()) {
            fos = new FileOutputStream(file,true);
            oos = new appendableObjectOutputStream(fos);
        }else {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(selected);
        oos.close();

        deliveryRequests.add(selected);

    }

  public void ShowAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(message);
        alert.showAndWait();
  }




    }





