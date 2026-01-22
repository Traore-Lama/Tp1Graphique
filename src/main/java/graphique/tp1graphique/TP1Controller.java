package graphique.tp1graphique;

import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

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
    private Circle cirMoove;
    @FXML
    private ImageView imgSettings;

    private TranslateTransition translateTransition;
    private RotateTransition rotateTransition;

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

        translateTransition = new TranslateTransition(Duration.seconds(1), cirMoove);
        translateTransition.setFromX(10);
        translateTransition.setToX(400);
        translateTransition.setAutoReverse(true);
        translateTransition.setCycleCount(Timeline.INDEFINITE);


        rotateTransition = new RotateTransition(Duration.seconds(1), imgSettings);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(Timeline.INDEFINITE);

    }

    // Effet quand on clique sur un boutton
    @FXML
    public void btnAjClicked(Event event) {

    }

    @FXML
    public void btnMoClicked(Event event) {
    }

    @FXML
    public void btnSuClicked(Event event) {
    }


    // Lancement de L'event Page 3
    @FXML
    public void btnAnimClicked(Event event) {
    translateTransition.play();
    rotateTransition.play();
}

    // Arret de L'event Page 3
    @FXML
    public void btnStopClicked(Event event){
        translateTransition.stop();
        rotateTransition.stop();
    }
}


