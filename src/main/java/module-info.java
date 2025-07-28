module com.example.fivestarthotel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fivestarthotel to javafx.fxml;
    exports com.example.fivestarthotel;
}