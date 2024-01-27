module com.example.devtrainning {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.devtrainning to javafx.fxml;
    exports com.example.devtrainning;
    exports com.example.devtrainning.entidades;
    opens com.example.devtrainning.entidades to javafx.fxml;
}