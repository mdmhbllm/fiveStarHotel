module com.example.fivestarhotel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fivestarthotel to javafx.fxml;
    exports com.example.fivestarthotel;
}