module com.example.ekonos_gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ekonos_gui to javafx.fxml;
    exports com.example.ekonos_gui;
}