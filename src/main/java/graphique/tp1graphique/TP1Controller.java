package graphique.tp1graphique;

import graphique.tp1graphique.model.Contact;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TP1Controller implements Initializable {

    private TranslateTransition translateTransition;
    private RotateTransition rotateTransition;

    // On va cree trois Objets de type Contacts
    Contact contact1 = new Contact("Fortin", 50, "Francois");
    Contact contact2 = new Contact("Mamadou", 50, "Gassama");
    Contact contact3 = new Contact("Cousinot", 50, "Sebastien");

    // On ajoute les 3 Objets a une collection (ArrayList)
    ObservableList<Contact> contacts = FXCollections.observableArrayList(contact1, contact2, contact3);  {
    };

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
    @FXML
    private Label lblComplet;
    @FXML
    private TableView tvContacts;
    @FXML
    private TableColumn tcAge;
    @FXML
    private TableColumn tcNom;
    @FXML
    private TableColumn tcPrenom;
    @FXML
    private Label lblContact3;
    @FXML
    private Label lblContact2;
    @FXML
    private Label lblContact1;


    @FXML
    public void btnMenu1Clicked(Event event)
    {
        apMenu1.toFront();
        lblComplet.setText("TP1 : Les Bases / Exemples nº1");
    }

    @FXML
    public void btnMenu2Clicked(Event event)
    {
        apMenu2.toFront();
        lblComplet.setText("TP1 : Les Bases / Exemples nº2");
        lblContact1.setText(contacts.get(0).getNom() + "\n" + contacts.get(0).getAge() + " ans");
        lblContact2.setText(contacts.get(1).getPrenom() + "\n" + contacts.get(1).getAge() + " ans");
        lblContact3.setText(contacts.get(2).getNom() + "\n" + contacts.get(2).getAge() + " ans");
    }

    @FXML
    public void btnMenu3Clicked(Event event)
    {
        apMenu3.toFront();
        lblComplet.setText("TP1 : Les Bases / Exemples nº3");

    }

    // Au chargement du Formulaire
    // Au Lancement de l'Appli
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        apMenu1.toFront();

        translateTransition = new TranslateTransition(Duration.seconds(1), cirMoove);
        translateTransition.setFromX(10);
        translateTransition.setToX(500);
        translateTransition.setAutoReverse(true);
        translateTransition.setCycleCount(Timeline.INDEFINITE);


        rotateTransition = new RotateTransition(Duration.seconds(1), imgSettings);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(Timeline.INDEFINITE);

        // On doit indiquer la valeur que chaque colone vas prendre
        tcNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        tcPrenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        tcAge.setCellValueFactory(new PropertyValueFactory<>("age"));


        // Rempli le TableView
        tvContacts.setItems(FXCollections.observableList(contacts));
    }

    // Effet quand on clique sur un boutton
    @FXML
    public void btnAjClicked(Event event) {

    }

    @FXML
    public void btnMoClicked(Event event)
    {

    }

    @FXML
    public void btnSuClicked(Event event)
    {

    }


    // Lancement de L'event Page 3
    @FXML
    public void btnAnimClicked(Event event)
    {
        translateTransition.play();
        rotateTransition.play();
    }

    // Arret de L'event Page 3
    @FXML
    public void btnStopClicked(Event event)
    {
        translateTransition.stop();
        rotateTransition.stop();
    }
}


