package projects;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class CenteredCircle extends Application {

    public void start(Stage stage){
        //Circle
        Circle circle = new Circle(50);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);
        circle.setFill(Color.WHITE);
        //Pane
        Pane root = new Pane();
        root.getChildren().add(circle);
        circle.centerXProperty().bind(root.widthProperty().divide(2));
        circle.centerYProperty().bind(root.heightProperty().divide(2));
        //Scene
        Scene scene = new Scene(root,300,300);
        stage.setTitle("Centered Circle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }

}
