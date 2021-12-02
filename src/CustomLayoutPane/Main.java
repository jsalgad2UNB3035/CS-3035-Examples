package CustomLayoutPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        MyCustomPane root = new MyCustomPane();
        root.setPrefSize(400,400);
        Scene scene = new Scene(root);

        MyCustomPane2 c2 = new MyCustomPane2();
        MyCustomButton b = new MyCustomButton("Button 1");
        c2.getChildren().add(b);
        root.getChildren().add(c2);

        Button b2 = new Button("Button 2");
        root.getChildren().add(b2);

        Button b3 = new Button("Button 3");
        root.getChildren().add(b3);

//        Rectangle rect = new Rectangle(100, 100);
//        root.getChildren().add(rect);

        primaryStage.setTitle("Custom Layout Pane Example");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
