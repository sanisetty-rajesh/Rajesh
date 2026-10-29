import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;

public class TextAndImageDisplay extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Label
        Label label = new Label("Hello, JavaFX!");
        label.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        // Image (change this path to your own image file)
        File file = new File("image.png");
        Image image = new Image(file.toURI().toString());
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(300);
        imageView.setPreserveRatio(true);

        // Layout
        VBox root = new VBox(20, label, imageView);
        root.setAlignment(Pos.TOP_CENTER);
        root.setPadding(new Insets(20));

        // Scene and Stage
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Text and Image Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
