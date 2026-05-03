package view;

import controller.CurrencyController;
import entity.Currency;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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

        Label fromLabel = new Label("From:");
        ChoiceBox<Currency> fromBox = new ChoiceBox<>();
        fromBox.getItems().addAll(controller.getCurrencies());

        Label toLabel = new Label("To:");
        ChoiceBox<Currency> toBox = new ChoiceBox<>();
        toBox.getItems().addAll(controller.getCurrencies());

        TextField amountField = new TextField();
        TextField resultField = new TextField();
        resultField.setEditable(false);

        Button btn = new Button("Convert");

        layout.add(fromLabel, 0, 0);
        layout.add(fromBox, 0, 1);
        layout.add(toLabel, 1, 0);
        layout.add(toBox, 1, 1);
        layout.add(amountField, 0, 2);
        layout.add(resultField, 1, 2);
        layout.add(btn, 0, 3, 2, 1);

        btn.setOnAction(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                Currency from = fromBox.getValue();
                Currency to = toBox.getValue();

                double result = controller.convert(amount, from, to);
                resultField.setText(String.valueOf(result));

            } catch (Exception ex) {
                resultField.setText("Error");
            }
        });

        stage.setScene(new Scene(layout, 400, 300));
        stage.show();
    }
}