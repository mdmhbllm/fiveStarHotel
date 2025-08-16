package com.example.fivestarhotel.FinalProject_UdoyRoy_2231379;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.MenuItem;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MenuManagementController
{
    @FXML
    private Button viewMenu;
    @FXML
    private TextField newPriceTextField;
    @FXML
    private TableColumn<javafx.scene.control.MenuItem,String> categoryCol;
    @FXML
    private TableColumn<javafx.scene.control.MenuItem,Double> priceCol;
    @FXML
    private TableColumn<javafx.scene.control.MenuItem,String> itemIdCol;
    @FXML
    private TextField itemIdTextField;
    @FXML
    private TableView<javafx.scene.control.MenuItem> menuTableView;
    @FXML
    private DatePicker lastUpdateDatePicker;
    @FXML
    private TableColumn<javafx.scene.control.MenuItem,String> nameCol;
    @FXML
    private TextField nameTextFied;
    @FXML
    private ComboBox<String> categoryFilterCombo;
    @FXML
    private TableColumn<javafx.scene.control.MenuItem, LocalDate> lastUpdateCol;
    @FXML
    private ComboBox<String> categoryCombo;


    @FXML
    private TextField currentPriceTextField;
    @FXML
    private Label messageLabel;

    ArrayList<javafx.scene.control.MenuItem> menuItems = new ArrayList<>();


    public void initialize() throws IOException{
        categoryCombo.getItems().addAll("Appetizer", "Main Course", "Dessert", "Drink");
        categoryFilterCombo.getItems().addAll("Appetizer", "Main Course", "Dessert", "Drink");


        itemIdCol.setCellValueFactory(new PropertyValueFactory<>("itemId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        categoryCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
        lastUpdateCol.setCellValueFactory(new PropertyValueFactory<>("lastUpdate"));


File file = new File("UpdatePrice.bin");

if (!file.exists()) {
    return;
}


FileInputStream fis = new FileInputStream(file);
ObjectInputStream ois = new ObjectInputStream(fis);


try {
    while(true) {
        javafx.scene.control.MenuItem m = (javafx.scene.control.MenuItem) ois.readObject();
        menuItems.add(m);
    }

}catch (EOFException eof) {
    System.out.println("end of file");
}catch (ClassNotFoundException cnf) {
    System.out.println("class not found");
}

menuTableView.getItems().addAll(menuItems);


    }

    @FXML
    public void clearOnAction(ActionEvent actionEvent) {
        itemIdTextField.clear();
        nameTextFied.clear();
        newPriceTextField.clear();
        currentPriceTextField.clear();
        categoryFilterCombo.setValue(null);
        lastUpdateDatePicker.setValue(null);



    }

    @FXML
    public void updateMenuOnAction(ActionEvent actionEvent) throws IOException {

        if (itemIdTextField.getText().isEmpty()) {
messageLabel.setText("Please enter item ID");
return;
        }

        if (nameTextFied.getText().isEmpty()) {
            messageLabel.setText("Please enter name");
            return;
        }
        if (newPriceTextField.getText().isEmpty()) {
            messageLabel.setText("Please enter price");
            return;
        }
        if (currentPriceTextField.getText().isEmpty()) {
            messageLabel.setText("Please enter price");
            return;
        }
        if (lastUpdateDatePicker.getValue() == null) {
            messageLabel.setText("Please enter last update");
            return;
        }

        if (categoryCombo.getValue() == null) {
            messageLabel.setText("Please select category");
            return;
        }


        String Id = itemIdTextField.getText();
        String Name = nameTextFied.getText();
        String Category = categoryCombo.getValue();
        Double Price = Double.parseDouble(newPriceTextField.getText());
        LocalDate lastUpdate = lastUpdateDatePicker.getValue();


        javafx.scene.control.MenuItem menu = new javafx.scene.control.MenuItem(Id,Name,Category,Price,lastUpdate);


        File file = new File("UpdatePrice.bin");

        FileOutputStream fis;
        ObjectOutputStream oos;

        if(file.exists()) {
            fis = new FileOutputStream(file,true);
            oos = new appendableObjectOutputStream(fis);
        }else {
            fis = new FileOutputStream(file);
            oos = new ObjectOutputStream(fis);
        }

        oos.writeObject(menu);
        oos.close();
        menuItems.add(menu);
        messageLabel.setText("Updated Price for ");

        menuTableView.getItems().clear();

        menuTableView.getItems().addAll(menuItems);

    }

    @FXML
    public void filterOnaction(ActionEvent actionEvent) {

        ArrayList<javafx.scene.control.MenuItem> filteredItems = new ArrayList<>();

        String category = categoryFilterCombo.getValue();

        menuTableView.getItems().clear();

        for (MenuItem item : menuItems) {
            if (item.getCategory().equals(category)) {
                menuTableView.getItems().add(item);
            }
           // menuTableView.getItems().clear();
            //menuTableView.getItems().addAll(item);
        }







    }

    @FXML
    public void backToDashboradOnAcion(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("restaurentManager.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage;
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }





}







