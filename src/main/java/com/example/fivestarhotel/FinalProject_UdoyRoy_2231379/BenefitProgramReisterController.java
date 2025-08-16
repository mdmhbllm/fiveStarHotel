package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.collections.transformation.FilteredList;
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

public class BenefitProgramReisterController
{
    @javafx.fxml.FXML
    private TableColumn<Benefit,String> typeCol;
    @javafx.fxml.FXML
    private ComboBox<String> benefitTypeCombo;
    @javafx.fxml.FXML
    private TableView<Benefit> registerBenefitTableView;
    @javafx.fxml.FXML
    private TextField employeeIdTextField;
    @javafx.fxml.FXML
    private Label statusLabel1;
    @javafx.fxml.FXML
    private TableColumn<Benefit,String> departmentCol;
    @javafx.fxml.FXML
    private DatePicker hireDatePicker;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TableColumn<Benefit,String> hireDateCol;
    @javafx.fxml.FXML
    private ComboBox<String> departmentCombo;
    @javafx.fxml.FXML
    private Label statusLabel11;
    @javafx.fxml.FXML
    private TableColumn<Benefit,String> idCol;
    @javafx.fxml.FXML
    private TableColumn<Benefit,String> nameCol;
    @javafx.fxml.FXML
    private ComboBox<String> filterdepartmentCombo;


    ArrayList<Benefit> benefits = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() throws IOException{
        departmentCombo.getItems().addAll("Front Office","Supplier","HouseKeeping","Restarant Manager","Finance & Accounting","Engineering & Maintenance");
        filterdepartmentCombo.getItems().addAll("Front Office","Supplier","HouseKeeping","Restarant Manager","Finance & Accounting","Engineering & Maintenance");
benefitTypeCombo.getItems().addAll("Health Insurance","Dental Coverage", "Vision Card", "Pension Plan", "Life Insurance", "Wellness Program", "Meal Allowance", "Transportation Allowance", "Education Assistance", "Employee Discount Program");





        nameCol.setCellValueFactory(new PropertyValueFactory<>("Name"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        hireDateCol.setCellValueFactory(new PropertyValueFactory<>("Hiredates"));
        departmentCol.setCellValueFactory(new PropertyValueFactory<>("Department"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("benefitType"));



        File file = new File("BenefitsProgramResister.bin");

        if (!file.exists()) {
            return;
        }

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);



        try{
            while (true){
                Benefit b = (Benefit) ois.readObject();
                benefits.add(b);
            }
        }catch(IOException eof){
            System.out.println("end");
        }catch(ClassNotFoundException enf){
            System.out.println("Not found");
        }
        registerBenefitTableView.getItems().addAll(benefits);




    }

    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
        employeeIdTextField.clear();
        nameTextField.clear();
        hireDatePicker.setValue(null);
        departmentCombo.setValue(null);
        benefitTypeCombo.setValue(null);



    }

    @javafx.fxml.FXML
    public void submitOnAction(ActionEvent actionEvent) throws IOException {

        if (employeeIdTextField.getText().isEmpty()) {
            ShowAlert("Please enter Employee ID");
            return;
        }
        if (nameTextField.getText().isEmpty()) {
            ShowAlert("Please enter Name");
            return;
        }
        if (hireDatePicker.getValue() == null) {
            ShowAlert("Please enter Hire Date");
            return;
        }
        if (departmentCombo.getValue() == null) {
            ShowAlert("Please select Department");
            return;
        }
        if (benefitTypeCombo.getValue() == null) {
            ShowAlert("Please select Department");
            return;
        }





         String name = nameTextField.getText();
         String id =  employeeIdTextField.getText();
         LocalDate hireDate = hireDatePicker.getValue();
         String department = departmentCombo.getValue();
         String type = benefitTypeCombo.getValue();


       Benefit benefit = new Benefit(name, id, hireDate, department, type);

       File file = new File("BenefitsProgramResister.bin");

       FileOutputStream fos;
       ObjectOutputStream oos;

       if (file.exists()) {
           fos = new FileOutputStream(file,true);
           oos = new appendableObjectOutputStream(fos);
       }else {
           fos = new FileOutputStream(file);
           oos = new ObjectOutputStream(fos);
       }
         oos.writeObject(benefit);
         oos.close();

       benefits.add(benefit);
       ShowAlert("Benefit Submitted");
       registerBenefitTableView.refresh();
       registerBenefitTableView.getItems().add(benefit);




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

    @javafx.fxml.FXML
    public void SearchOnAction(ActionEvent actionEvent) {

        ArrayList<Benefit> FilterData = new ArrayList<>();
        String dep = filterdepartmentCombo.getValue();

        for (Benefit bd : benefits) {
            if (bd.getDepartment().equals(dep)) {
                FilterData.add(bd);
            }
        }
        registerBenefitTableView.getItems().clear();
        registerBenefitTableView.getItems().addAll(FilterData);





    }


    public void ShowAlert(String message){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(message);
        a.showAndWait();
    }
}