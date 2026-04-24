package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NoteApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // start load
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/note_view.fxml"));
        Parent root = loader.load();

        stage.setTitle("Notebook MVC");
        stage.setScene(new Scene(root));
        stage.show();
    }
}