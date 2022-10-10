module com.example.cookbook {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.cookbook to javafx.fxml;
    exports com.example.cookbook;
}