import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane rootLayout = new BorderPane();
        Scene scene = new Scene(rootLayout, 800, 600); // Width, Height
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void mainn(String[] args) {
        launch(args);
    }
}