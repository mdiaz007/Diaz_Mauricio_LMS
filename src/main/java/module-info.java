module com.mauricio.librarymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.mauricio.librarymanagementsystem to javafx.fxml;
    exports com.mauricio.librarymanagementsystem;
}