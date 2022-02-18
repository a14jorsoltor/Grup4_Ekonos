module com.example.ekonos_gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.ekonos_gui to javafx.fxml;
    exports com.example.ekonos_gui;
    exports com.example.ekonos_logica.Main;
    opens com.example.ekonos_logica.Main to javafx.fxml;
}