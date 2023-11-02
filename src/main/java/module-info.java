module com.example.ipap {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.ipap to javafx.fxml;
    exports com.example.ipap;
}