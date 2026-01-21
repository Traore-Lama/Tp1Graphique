package graphique.tp1graphique;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class TP1Controller implements Initializable {

    @FXML
    private Button btnMenu2;
    @FXML
    private Button btnMenu1;
    @FXML
    private AnchorPane apMenu3;
    @FXML
    private AnchorPane apMenu2;
    @FXML
    private AnchorPane apMenu1;
    @FXML
    private Button btnMenu3;

    @FXML
    public void btnMenu3Clicked(Event event) {
        apMenu3.toFront();
    }

    @FXML
    public void btnMenu2Clicked(Event event) {
        apMenu2.toFront();
    }

    @FXML
    public void btnMenu1Clicked(Event event) {
        apMenu1.toFront();
    }


    // Au chargement du Formulaire
    // Au Lancement de l'Appli
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        apMenu1.toFront();
    }
}
