package projects;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class ColorMixer extends Application {
    @Override
    public void start(Stage stage){
        double r = 0.60;
        double g = 0.60;
        double b = 0.10;

        Rectangle colorPreview = new Rectangle(200, 200);
        colorPreview.setFill(new Color(r, g, b, 1.0));

        Text rLabel = new Text(String.format("R: %.2f", r));
        Text gLabel = new Text(String.format("G: %.2f", g));
        Text bLabel = new Text(String.format("B: %.2f", b));

        String hexCode = String.format("#%02X%02X%02X",
                (int)(r * 255),
                (int)(g * 255),
                (int)(b * 255));
        Text hexLabel = new Text(hexCode);
        hexLabel.setFont(Font.font("System", FontWeight.BOLD, 16));

        VBox root = new VBox(8);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(colorPreview, rLabel, gLabel, bLabel, hexLabel);

        Scene scene = new Scene(root, 300, 400);
        stage.setTitle("Color Mixer");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){
        launch();
    }
}
