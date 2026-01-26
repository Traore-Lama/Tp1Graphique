module graphique.tp1graphique {
    requires javafx.controls;
    requires javafx.fxml;

    opens graphique.tp1graphique.model;


    opens graphique.tp1graphique to javafx.fxml;
    exports graphique.tp1graphique;
}