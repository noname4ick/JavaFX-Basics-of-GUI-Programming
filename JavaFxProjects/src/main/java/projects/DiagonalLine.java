package projects;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class DiagonalLine extends Application {

    @Override
    public void start(Stage stage){
        Pane root = new Pane();
        Line line = new Line();
        line.setStartX(0);
        line.setStartY(0);

        line.endYProperty().bind(root.heightProperty());
        line.endXProperty().bind(root.widthProperty());

        line.setStrokeWidth(3);
        line.setStroke(Color.GREEN);

        root.getChildren().add(line);

        Scene scene = new Scene(root,400,300);
        stage.setTitle("Resize-Aware Diagonal");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
