package projects;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TrafficLight extends Application {
    @Override
    public void start(Stage stage){
        //red
        Circle red = new Circle(30);
        red.setFill(Color.RED);
        red.setStroke(Color.DARKGRAY);
        red.setStrokeWidth(2);
        //yellow
        Circle yellow = new Circle(30);
        yellow.setFill(Color.YELLOW);
        yellow.setStrokeWidth(2);
        yellow.setStroke(Color.DARKGRAY);
        //green
        Circle green = new Circle(30);
        green.setFill(Color.GREEN);
        green.setStroke(Color.DARKGRAY);
        green.setStrokeWidth(2);
        //opacity
        red.setOpacity(1);
        yellow.setOpacity(0.3);
        green.setOpacity(0.3);
        //status
        Text text = new Text("Stop");
        text.setFont(
                Font.font(
                        "Times New Roman",
                        FontWeight.BOLD,
                        18
                ));

        //Body of the traffic light
        VBox body = new VBox(5);
        body.setPadding(new Insets(20));
        body.getChildren().addAll(red,yellow,green,text);
        //Scene
        Scene scene = new Scene(body,100,300);
        scene.setFill(Color.DARKGRAY);
        stage.setTitle("Traffic Light");
        stage.setScene(scene);
        stage.show();
    }

    public static void  main(String[] args){
        launch();
    }
}
