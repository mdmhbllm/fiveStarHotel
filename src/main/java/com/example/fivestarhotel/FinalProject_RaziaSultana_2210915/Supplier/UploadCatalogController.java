package com.example.fivestarhotel.FinalProject_RaziaSultana_2210915.Supplier;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class UploadCatalogController {

    @FXML
    private ComboBox<String> fileCB;

    @FXML
    private Label catalogUploadSuccessfullyL;

    @FXML
    private Label uploadCatalogL;

    @FXML
    private ComboBox<String> catagoryCB;

    private File selectedFile;

    @FXML
    public void initialize() {
        catagoryCB.setItems(FXCollections.observableArrayList("Food", "Linen", "Cleaning Supplies"));

        fileCB.setItems(FXCollections.observableArrayList("PDF", "Excel"));

        catalogUploadSuccessfullyL.setText("");
    }

    @FXML
    public void returnToDashboardOA(ActionEvent actionEvent) {
        Stage stage = (Stage) uploadCatalogL.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void browseOA(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Catalog File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("PDF Files", "*.pdf"),
                new FileChooser.ExtensionFilter("Excel Files", "*.xls", "*.xlsx")
        );

        selectedFile = fileChooser.showOpenDialog(uploadCatalogL.getScene().getWindow());

        if (selectedFile != null) {
            catalogUploadSuccessfullyL.setText("Selected: " + selectedFile.getName());
            if (selectedFile.getName().toLowerCase().endsWith(".pdf")) {
                fileCB.setValue("PDF");
            } else if (selectedFile.getName().toLowerCase().endsWith(".xls") || selectedFile.getName().toLowerCase().endsWith(".xlsx")) {
                fileCB.setValue("Excel");
            }
        }
    }

    @FXML
    public void submitOA(ActionEvent actionEvent) {
        String category = catagoryCB.getValue();
        String fileType = fileCB.getValue();

        if (category == null || category.isEmpty()) {
            showAlert("Category Required", "Please select a category.");
            return;
        }
        if (selectedFile == null) {
            showAlert("File Required", "Please browse and select a file to upload.");
            return;
        }
        if (fileType == null || fileType.isEmpty()) {
            showAlert("File Type Required", "Please select the file type.");
            return;
        }

        if ((fileType.equals("PDF") && !selectedFile.getName().toLowerCase().endsWith(".pdf")) ||
                (fileType.equals("Excel") && !(selectedFile.getName().toLowerCase().endsWith(".xls") || selectedFile.getName().toLowerCase().endsWith(".xlsx")))) {
            showAlert("Invalid File Type", "Selected file does not match the chosen file type.");
            return;
        }

        if (selectedFile.length() > 5 * 1024 * 1024) {
            showAlert("File Too Large", "File size must be less than 5MB.");
            return;
        }

        UploadCatalog uploadedCatalog = new UploadCatalog(
                category,
                selectedFile.getAbsolutePath(),
                selectedFile.getName(),
                selectedFile.length(),
                fileType
        );

        catalogUploadSuccessfullyL.setText("Catalog uploaded successfully: " + uploadedCatalog.getFileName());

        catagoryCB.getSelectionModel().clearSelection();
        fileCB.getSelectionModel().clearSelection();
        selectedFile = null;
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
