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

public class SentPolicyReminderToEmployeeController
{
    @javafx.fxml.FXML
    private TableColumn<Policy,String> messageCol;
    @javafx.fxml.FXML
    private TableColumn<Policy,String> titleCol;
    @javafx.fxml.FXML
    private TextArea meaasageTextArea;
    @javafx.fxml.FXML
    private TableColumn<Policy,String> policyIdCol;
    @javafx.fxml.FXML
    private TableView<Policy> tableView;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<Policy, LocalDate> sentDateCol;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextField policytitleTextField1;
    @javafx.fxml.FXML
    private TextField policyNoTextFiled;


ArrayList<Policy> policies = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() throws IOException{

        policyIdCol.setCellValueFactory(new PropertyValueFactory<>("policyId"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        messageCol.setCellValueFactory(new PropertyValueFactory<>("message"));
        sentDateCol.setCellValueFactory(new PropertyValueFactory<>("dateSent"));


    File file = new File ("Policys.bin");

     if (!file.exists()) {
          return;
       }

        FileInputStream fis = new FileInputStream(file);
         ObjectInputStream ois = new ObjectInputStream(fis);

         try{
             while (true){
                 Policy pr = (Policy) ois.readObject();
                 policies.add(pr);
             }
         }catch(EOFException eof){
             System.out.println("EOF");
         }catch (ClassNotFoundException enf){
             System.out.println("Class not found");
         }
         tableView.getItems().addAll(policies);




    }

    @javafx.fxml.FXML
    public void clearFormOnAction(ActionEvent actionEvent) {
        policyNoTextFiled.clear();
        policytitleTextField1.clear();
        meaasageTextArea.clear();
        datePicker.setValue(null);
        messageLabel.setText("Form cleared.");


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
    public void sentReminderToAllOnAction(ActionEvent actionEvent) throws IOException {
        if(policyNoTextFiled.getText().isEmpty() || policytitleTextField1.getText().isEmpty()) {
            messageLabel.setText("Please enter all the fields.");
            return;
        }
if (datePicker.getValue() == null) {
    messageLabel.setText("Please select a date to send.");
    return;
}
if (meaasageTextArea.getText().isEmpty()) {
    messageLabel.setText("Please enter a message to send.");
    return;
}


String policyNo = policyNoTextFiled.getText();
String policyTitle = policytitleTextField1.getText();
LocalDate sentDate = datePicker.getValue();
String message = meaasageTextArea.getText();


Policy p = new Policy(policyNo,policyTitle,message,sentDate);

policies.add(p);


File file = new File("Policys.bin");

FileOutputStream fos;
ObjectOutputStream oos;

if (file.exists()) {
    fos = new FileOutputStream(file,true);
    oos = new appendableObjectOutputStream(fos);
}else{
    fos = new FileOutputStream(file);
    oos = new ObjectOutputStream(fos);
}
oos.writeObject(p);
oos.close();
tableView.getItems().add(p);



    }
}