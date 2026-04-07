package projects;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShapesPanel extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        //Rectangle
        Rectangle rectangle = new Rectangle(80,60);
        rectangle.setArcWidth(20);
        rectangle.setArcHeight(20);
        rectangle.setStrokeWidth(2);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.RED);
        //Circle
        Circle circle = new Circle(0,0,40);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);
        circle.setFill(Color.BLUE);
        //Ellipse
        Ellipse ellipse = new Ellipse(0,0,50,30);
        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(2);
        //HBox
        HBox hbox = new HBox(20);
        hbox.setPadding(new Insets(20,20,20,20));
        hbox.getChildren().addAll(rectangle,circle,ellipse);
        Scene scene = new Scene(hbox,400,200);
        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(){
        launch();
    }

}
