package graphique.tp1graphique;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TP1Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TP1Application.class.getResource("tp1-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Connexion de la feuille de style CSS
        scene.getStylesheets().add(
                TP1Application.class
                        .getResource("style.css")
                        .toExternalForm()
        );
        stage.setTitle("TP1 !");
        stage.setScene(scene);
        stage.show();
    }
}
