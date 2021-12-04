module com.example.justinsavesusonsprint2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.Sprint2 to javafx.fxml;
    exports com.example.Sprint2;
}