module adrian.roszkowski.revert {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens adrian.roszkowski.revert.backend to javafx.fxml;
    exports adrian.roszkowski.revert.backend;
    exports adrian.roszkowski.revert.frontend;
    opens adrian.roszkowski.revert.frontend to javafx.fxml;
}