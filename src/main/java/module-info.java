module adrian.roszkowski.revert {
    requires javafx.controls;
    requires javafx.fxml;


    opens adrian.roszkowski.revert to javafx.fxml;
    exports adrian.roszkowski.revert;
    exports adrian.roszkowski.revert.ui;
    opens adrian.roszkowski.revert.ui to javafx.fxml;
}