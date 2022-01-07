module org.openjfx.GenetiskAlgoritme {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx.GenetiskAlgoritme to javafx.fxml;
    exports org.openjfx.GenetiskAlgoritme;
}
