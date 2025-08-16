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
import java.util.ArrayList;
import java.util.List;

public class UpdateShiftPreferenceController
{
    @javafx.fxml.FXML
    private ComboBox<String> preferredShiftCombo;
    @javafx.fxml.FXML
    private TableView<Employee> tableView;
    @javafx.fxml.FXML
    private TableColumn<Employee,Integer> employeeIdCol;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextArea notesTextArea;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> shiftCol;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> depertmentCol;
    @javafx.fxml.FXML
    private TextField empolyeeiDtextField;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> roleCol;
    @javafx.fxml.FXML
    private ComboBox<String> availableDaysCombo;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> daysAvailableCol;

ArrayList<Employee> employees = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() throws IOException{
        preferredShiftCombo.getItems().addAll("Morning", "Afternoon", "Evening", "Night");
        availableDaysCombo.getItems().addAll( "MON-FRI","Mon-Thu","Tue-Fri","Wed-Fri","All Weeks");

        employeeIdCol.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        depertmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        roleCol.setCellValueFactory(new PropertyValueFactory<>("role"));
        shiftCol.setCellValueFactory(new PropertyValueFactory<>("shiftPre"));
        daysAvailableCol.setCellValueFactory(new PropertyValueFactory<>("DaysAvailable"));


        if (employees.isEmpty()) {
            employees.add(new Employee("101","Rony","Kitchen","Chef",null,"Morning","Mon,- Fri",null,null));
            employees.add(new Employee("103", "Tanvir", "Restarant", "Manager", null, "Evening", "Mon–Fri",null,null));
            employees.add(new Employee("104","Ayan","HouseKeeping","Cleaner",null,"Afternoon","Fri- Sun",null,null));
            employees.add(new Employee("105","Joy","Front Office","Waiter",null,"Night","Mon- Thu",null,null));
            employees.add(new Employee("106","Nabil","HouseKeeping","Supervisor",null,"Morning","All Week",null,null));


        }

        tableView.getItems().addAll(employees);


     File file = new File("UpdateShift.bin");

     if(file.exists()){
         return;
     }

     FileInputStream fis = new FileInputStream(file);
     ObjectInputStream ois = new ObjectInputStream(fis);


     try{
        while(true){
            Employee e = (Employee) ois.readObject();
            employees.add(e);
        }
     }catch(EOFException eof){
         System.out.println("Eof");
     }catch(ClassNotFoundException enf){
         System.out.println("Class not found");
     }







    }

    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
empolyeeiDtextField.clear();
availableDaysCombo.getItems().clear();
preferredShiftCombo.getItems().clear();





    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoaders = new FXMLLoader(getClass().getResource("dashboradForUser6HRManager.fxml"));
        Scene scene = new Scene(fxmlLoaders.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }


    @javafx.fxml.FXML
    public void updatePOnAction(ActionEvent actionEvent) throws IOException {

        if (empolyeeiDtextField.getText().isEmpty()) {
            statusLabel.setText("Please enter an empolyeei day");
            return;
        }
if (availableDaysCombo.getValue() == null) {
    statusLabel.setText("Please select a day");
    return;
}
if (preferredShiftCombo.getValue() == null) {
    statusLabel.setText("Please select a shift");
    return;
}

   Employee SelectedEmployee = tableView.getSelectionModel().getSelectedItem();

if (SelectedEmployee == null) {
    statusLabel.setText("Please select an employee");
    return;

}

        if (!SelectedEmployee.getEmployeeId().equals(empolyeeiDtextField.getText())) {
            statusLabel.setText("Entered ID does not match the selected employee");
            return;
        }

        SelectedEmployee.setShiftPre(preferredShiftCombo.getValue());
        SelectedEmployee.setDaysAvailable(availableDaysCombo.getValue());


        tableView.refresh();

        statusLabel.setText("Shift preference updated successfully!");


        File file = new File ("UpdateShift.bin");

        FileOutputStream fos;
        ObjectOutputStream oos;

        if (file.exists()) {
            fos = new FileOutputStream(file,true);
            oos = new appendableObjectOutputStream(fos);
        }else {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(employees);
        oos.close();
        tableView.refresh();
        tableView.getItems().add(SelectedEmployee);




    }
}