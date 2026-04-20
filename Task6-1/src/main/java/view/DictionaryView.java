package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {

    private DictionaryController controller = new DictionaryController();

    @Override
    public void start(Stage stage) {

        TextField input = new TextField();
        input.setPromptText("Enter word");

        Button searchBtn = new Button("Search");

        Label result = new Label("Meaning will appear here");

        FlowPane layout = new FlowPane();
        layout.setHgap(10);
        layout.setVgap(10);

        layout.getChildren().addAll(input, searchBtn, result);

        searchBtn.setOnAction(e -> {
            String word = input.getText();
            String meaning = controller.search(word);
            result.setText(meaning);
        });

        Scene scene = new Scene(layout, 300, 150);

        stage.setTitle("Dictionary");
        stage.setScene(scene);
        stage.show();
    }
}