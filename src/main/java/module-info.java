module com.example.justinsavesusonsprint2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.justinsavesusonsprint2 to javafx.fxml;
    exports com.example.justinsavesusonsprint2;
}