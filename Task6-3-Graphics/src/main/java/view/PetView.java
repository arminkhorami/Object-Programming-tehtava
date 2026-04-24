package view;

import controller.PetController;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PetView extends Application {
    private PetController controller = new PetController();
    private double mouseX, mouseY;
    private boolean mouseInside = false;
    private Image petImage;

    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(600, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();


        petImage = new Image("https://cdn-icons-png.flaticon.com/64/616/616408.png");

        canvas.setOnMouseMoved(e -> {
            mouseX = e.getX();
            mouseY = e.getY();
            mouseInside = true;
        });

        canvas.setOnMouseExited(e -> mouseInside = false);

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (mouseInside) {
                    controller.updatePetPosition(mouseX, mouseY);
                }
                draw(gc);
            }
        }.start();

        stage.setScene(new Scene(new StackPane(canvas)));
        stage.setTitle("Virtual Pet Walk");
        stage.show();
    }

    private void draw(GraphicsContext gc) {
        gc.clearRect(0, 0, 600, 400);
        gc.drawImage(petImage, controller.getPetX() - 32, controller.getPetY() - 32, 64, 64);
    }
}