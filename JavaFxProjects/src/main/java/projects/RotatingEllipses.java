package projects;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class RotatingEllipses extends Application {
    @Override
    public void start(Stage primaryStage) {
        EllipsePane ellipsePane = new EllipsePane();

        Scene scene = new Scene(ellipsePane, 500, 500);

        primaryStage.setTitle("Rotating Ellipses");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// Custom Pane class
class EllipsePane extends Pane {

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paintEllipses();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paintEllipses();
    }

    private void paintEllipses() {
        getChildren().clear();

        double w = getWidth();
        double h = getHeight();

        for (int i = 0; i < 16; i++) {
            Ellipse ellipse = new Ellipse(
                    w / 2,
                    h / 2,
                    w / 2 - 50,
                    h / 2 - 50
            );

            ellipse.setFill(Color.TRANSPARENT);
            ellipse.setStroke(Color.color(Math.random(), Math.random(), Math.random(),1));

            ellipse.setRotate(i * 180.0 / 16);

            getChildren().add(ellipse);
        }
    }
}