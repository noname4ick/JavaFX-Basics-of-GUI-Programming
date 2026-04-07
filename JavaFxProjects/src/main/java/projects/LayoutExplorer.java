package projects;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class LayoutExplorer extends Application {


    public void start(Stage stage){
        //Top
        HBox top = new HBox(10);
        top.setPadding(new Insets(10));
        top.setStyle("-fx-background-color: gold");
        top.getChildren().add(new Button("File"));
        top.getChildren().add(new Button("Save"));
        top.getChildren().add(new Button("Cancel"));
        //Left
        VBox left = new VBox(8);
        left.setPadding(new Insets(10));
        left.getChildren().add(new Label("Courses"));

        Label[] courses = {new Label("CS101"),new Label("CS201"),new Label("CS221"),new Label("CS301")};
        for(Label course : courses){
            VBox.setMargin(course,new Insets(0,0,0,15));
            left.getChildren().add(course);
        }

        //Center
        GridPane center = new GridPane();
        center.setHgap(5);
        center.setVgap(5);
        center.setAlignment(Pos.CENTER);
        center.setPadding(new Insets(10));
        Label firstName = new Label("First Name");
        Label lastName = new Label("Last Name");
        TextField firstNameT  = new TextField();
        TextField lastNameT  = new TextField();
        center.add(firstName,0,0);
        center.add(firstNameT,0,1);
        center.add(lastName,0,2);
        center.add(lastNameT,0,3);
        //BorderPane
        BorderPane root = new BorderPane();
        root.setTop(top);
        root.setLeft(left);
        root.setCenter(center);

        Scene scene = new Scene(root,450,300);
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){
        launch();
    }

}
