package projects;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloJavaFx extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Text name = new Text("Biloliddin Nematov");
        name.setFont(
                Font.font(
                        "Times New Roman",
                        FontWeight.BOLD,
                        FontPosture.ITALIC,
                        20
                ));
        Text id = new Text("250267");
        id.setFill(Color.RED);

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(name, id);
        vbox.setAlignment(Pos.CENTER);

        StackPane root = new StackPane();
        root.getChildren().add(vbox);
        root.setAlignment(Pos.CENTER);


        Scene scene = new Scene(root,300,150);
        stage.setScene(scene);
        stage.setTitle("Student Card");
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
