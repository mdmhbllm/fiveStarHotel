package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ReservationManagementController
{
    @javafx.fxml.FXML
    private Button clearOnAction;
    @javafx.fxml.FXML
    private ComboBox<String> timeCombo;
    @javafx.fxml.FXML
    private TableColumn<Reservation,Integer> partySizeCol;
    @javafx.fxml.FXML
    private ComboBox<String> filtertableTypeCombo;
    @javafx.fxml.FXML
    private ComboBox<String> tableCombo;
    @javafx.fxml.FXML
    private TableView<Reservation> tableView;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField guestNameTextField;
    @javafx.fxml.FXML
    private TextArea specialRequestTextArea;
    @javafx.fxml.FXML
    private TableColumn<Reservation,String> tableCol;
    @javafx.fxml.FXML
    private TableColumn<Reservation, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<Reservation,String> statusCol;
    @javafx.fxml.FXML
    private Spinner<Integer> partySizeSpinner;
    @javafx.fxml.FXML
    private DatePicker filterDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Reservation,String> guestCol;
    @javafx.fxml.FXML
    private TableColumn<Reservation,String> timeCol;
    @javafx.fxml.FXML
    private TableColumn<Reservation,Integer> capacityCol;
    @javafx.fxml.FXML
    private AnchorPane vipCheckbok;
    @javafx.fxml.FXML
    private CheckBox vipcheckBok;

    @javafx.fxml.FXML
    public void initialize() throws IOException{

        partySizeSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10));

        timeCombo.getItems().addAll("1PM", "2PM", "3PM", "4PM", "5PM", "6PM", "7PM", "8PM", "9PM");
        tableCombo.getItems().addAll("T1", "T2", "T3", "T4","T5","T6","T7");

        filtertableTypeCombo.getItems().addAll("T1", "T2", "T3", "T4","T5","T6","T7");



        guestCol.setCellValueFactory(new PropertyValueFactory<>("guest"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        partySizeCol.setCellValueFactory(new PropertyValueFactory<>("partySize"));
        tableCol.setCellValueFactory(new PropertyValueFactory<>("table"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        capacityCol.setCellValueFactory(new PropertyValueFactory<>("capacity"));



        File file = new File ("reservations.bin");
        if (!file.exists()) {
            return;
        }


        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);


        try {
            while (true){
            Reservation reser = (Reservation) ois.readObject();
            reservations.add(reser);
            }
        }catch (EOFException eof){
            System.out.println("End of file");
        }catch (ClassNotFoundException enf){
            System.out.println("Class not found");
        }

        tableView.getItems().addAll(reservations);


    }


    ArrayList<Reservation> reservations = new ArrayList<>();


    @javafx.fxml.FXML
    public void filterDataOnAction(ActionEvent actionEvent) {
        String selectedTableType = filtertableTypeCombo.getValue();
        LocalDate selectedDate = filterDatePicker.getValue();


        if (selectedTableType == null && selectedDate == null) {
            tableView.getItems().setAll(reservations);
            return;
        }
        ArrayList<Reservation> filteredList = new ArrayList<>();
        for (Reservation r : reservations) {
            boolean matchesTable = (selectedTableType == null || r.getTable().equals(selectedTableType));
            boolean matchesDate = (selectedDate == null || r.getDate().equals(selectedDate));

            if (matchesTable && matchesDate) {
                filteredList.add(r);
            }
        }

        tableView.getItems().addAll(filteredList);

        if (filteredList.isEmpty()) {
            messageLabel.setText("No reservations match the filter");
        } else {
            messageLabel.setText(filteredList.size() + " reservation(s) found");
        }

    }


    @javafx.fxml.FXML
    public void createFReservationOnAction(ActionEvent actionEvent) throws IOException {

     if (guestNameTextField.getText().isEmpty()) {
        messageLabel.setText("Please enter guest name");
            return;
           }
     if (datePicker.getValue() == null) {
    messageLabel.setText("Please select a date");
             return;
           }
     if (partySizeSpinner.getValue() == null) {
    messageLabel.setText("Please select a party size");
    return;
          }
     if (timeCombo.getValue() == null) {
         messageLabel.setText("Please select a time");
         return;
     }
    if (tableCombo.getValue() == null) {
        messageLabel.setText("Please select a table");
        return;
    }

    String vip = "NO";

    if (vipcheckBok.isSelected()) {
        vip = "YES";
    }
        String guest = guestNameTextField.getText();
        LocalDate date = datePicker.getValue();
        String time = timeCombo.getValue();
        int partySize = partySizeSpinner.getValue();
        String table = tableCombo.getValue();
        String specialRequest = specialRequestTextArea.getText();
        String cb = vip;
        int capacity = (10);


        Reservation rp = new Reservation(guest,date,time,partySize,table,specialRequest,cb,capacity);



        File file = new File("reservations.bin");

        FileOutputStream fis;
        ObjectOutputStream oos;



        if(file.exists()) {
             fis = new FileOutputStream(file,true);
             oos = new appendableObjectOutputStream(fis);
        }else {
            fis = new FileOutputStream(file);
            oos = new ObjectOutputStream(fis);
        }
        oos.writeObject(rp);
        oos.close();
        reservations.add(rp);
        messageLabel.setText("Reservation created");


        tableView.getItems().addAll(reservations);




    }

    @javafx.fxml.FXML
    public void cencleOnAction(ActionEvent actionEvent) {
        guestNameTextField.clear();
        datePicker.setValue(null);
        partySizeSpinner.getValueFactory().setValue(1);
        timeCombo.setValue(null);
        tableCombo.setValue(null);
        specialRequestTextArea.clear();
        vipcheckBok.setSelected(false);
        messageLabel.setText("");

    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("restaurentManager.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
}