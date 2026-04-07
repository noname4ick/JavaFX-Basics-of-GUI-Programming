package projects;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ProfileCard extends Application {
    public void start(Stage stage){
        BorderPane root = new BorderPane();
        HBox top = new HBox();
        top.setStyle("-fx-background-color: #2C3E50;");
        top.setPadding(new Insets(12));
        Label name = new Label("Nematov Biloliddin");
        name.setFont(Font.font("Times New Roman", FontWeight.BOLD,16));
        name.setTextFill(Color.WHITE);
        top.getChildren().add(name);

        GridPane center = new GridPane();
        center.setHgap(10);
        center.setVgap(10);
        center.setPadding(new Insets(20));
        Label[] data = {new Label("Department"),new Label("Year"), new Label("GPA")};
        Label[] info = {new Label("Computer Science"), new Label("Freshman"),new Label("4.0")};
        for(int i = 0; i < data.length;i++){
            center.add(data[i],0,i);
            center.add(info[i],1,i);
        }

        Label bottomText = new Label("New Uzbekistan University");
        bottomText.setAlignment(Pos.CENTER);
        bottomText.setMaxWidth(Double.MAX_VALUE);
        bottomText.setPadding(new Insets(8));
        bottomText.setStyle("-fx-background-color: #ECF0F1;-fx-font-size: 13;");

        root.setTop(top);
        root.setCenter(center);
        root.setBottom(bottomText);

        Scene scene = new Scene(root,400,250);
        stage.setTitle("Profile Card");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
