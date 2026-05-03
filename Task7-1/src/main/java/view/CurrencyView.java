package view;

import controller.CurrencyController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Currency;


public class CurrencyView extends Application {
    private CurrencyController controller = new CurrencyController();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Currency Converter");

        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setHgap(15);
        layout.setVgap(15);
        layout.setPadding(new Insets(20));

        Label headerLabel = new Label("Currency Converter Service");
        headerLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        Label fromLabel = new Label("Source Currency:");
        ChoiceBox<Currency> fromBox = new ChoiceBox<>();
        fromBox.getItems().addAll(controller.getCurrencies());

        Label toLabel = new Label("Target Currency:");
        ChoiceBox<Currency> toBox = new ChoiceBox<>();
        toBox.getItems().addAll(controller.getCurrencies());

        Label amountLabel = new Label("Amount to Convert:");
        TextField amountField = new TextField();

        Label resultLabel = new Label("Converted Amount:");
        TextField resultField = new TextField();
        resultField.setEditable(false);

        Button convertButton = new Button("Convert Now");
        convertButton.setMaxWidth(Double.MAX_VALUE);

        layout.add(headerLabel, 0, 0, 2, 1);
        layout.add(fromLabel, 0, 1);
        layout.add(fromBox, 0, 2);
        layout.add(toLabel, 1, 1);
        layout.add(toBox, 1, 2);
        layout.add(amountLabel, 0, 3);
        layout.add(amountField, 0, 4);
        layout.add(resultLabel, 1, 3);
        layout.add(resultField, 1, 4);
        layout.add(convertButton, 0, 5, 2, 1);

        // رویداد کلیک
        convertButton.setOnAction(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                Currency from = fromBox.getValue();
                Currency to = toBox.getValue();

                double result = controller.convert(amount, from, to);
                resultField.setText(String.format("%.2f", result));
            } catch (NumberFormatException ex) {
                resultField.setText("Error: Enter a number");
            }
        });

        Scene scene = new Scene(layout, 450, 400);


        try {
            scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        } catch (Exception e) {
            System.out.println("CSS file not found in resources!");
        }

        stage.setScene(scene);
        stage.show();
    }
}