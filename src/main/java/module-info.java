module com.example.fivestarhotel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fivestarhotel to javafx.fxml;
    opens com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest to javafx.fxml;
    opens com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel to javafx.fxml;
    opens com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Receptionist to javafx.fxml;
    exports com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Guest;
    exports com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel;
    exports com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Receptionist;
    exports com.example.fivestarhotel;
    exports com.example.fivestarhotel.User;
    opens com.example.fivestarhotel.User to javafx.fxml;

}