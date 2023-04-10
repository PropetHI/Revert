package adrian.roszkowski.revert.backend;

import javafx.fxml.FXMLLoader;

import java.io.IOException;
/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lesa fxml skrá
 *  +
 *  ADRIAN ROSZKOWSKI
 *  I modified the names here to be English.
 *****************************************************************************/
public class FXMLreader {
    public static void read(Object controller, String fxmlSkra) {
        FXMLLoader fxmlLoader = new FXMLLoader(controller.getClass().getResource(fxmlSkra));
        fxmlLoader.setClassLoader(controller.getClass().getClassLoader()); // EÞH viðbót fyrir hreiðraða sérhæfða klasa - sjá hér lausn https://stackoverflow.com/questions/50482659/scene-builder-nested-custom-nodes/50493549#50493549
        fxmlLoader.setRoot(controller);
        fxmlLoader.setController(controller);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
