package adrian.roszkowski.revert.frontend;

import adrian.roszkowski.revert.backend.ImageAlgorithms;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    ImageAlgorithms imageAlgorithms;


    public void initialize() {
        imageAlgorithms = new ImageAlgorithms();
    }

}