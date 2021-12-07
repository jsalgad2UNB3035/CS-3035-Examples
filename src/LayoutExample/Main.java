package LayoutExample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.awt.*;

public class Main extends Application {
    private BorderPane root;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();

        HBox topButtons = new HBox();
        topButtons.getChildren().add(new Button("Left"));
        topButtons.getChildren().add(new Button("Right"));

        HBox bottomButtons = new HBox();
        bottomButtons.getChildren().add(new Button("Left"));
        bottomButtons.getChildren().add(new Button("Right"));
        bottomButtons.setAlignment(Pos.BOTTOM_RIGHT);
        root.setTop(topButtons);
        root.setBottom(bottomButtons);

        root.setLeft(createShapeFlowPane(Color.CORNFLOWERBLUE));
        root.setCenter(createShapeFlowPane(Color.STEELBLUE));
        root.setRight(createShapeFlowPane(Color.CORAL));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

        displayBounds("FlowPane", root.getCenter());
        displayBounds("RandomRect", ((FlowPane) root.getCenter()).getChildren().get(10));
        Rectangle r = (Rectangle) ((FlowPane) root.getCenter()).getChildren().get(10);
        r.translateXProperty().add(10);
        r.rotateProperty().add(45);
        r.scaleXProperty().add(2);
        r.setFill(Color.DARKRED);

        root.layoutBoundsProperty().addListener((observable, oldValue, newValue) -> {
            displayBounds("FlowPane", root.getCenter());
            displayBounds("RandomRect", ((FlowPane) root.getCenter()).getChildren().get(10));
        });
    }

    private void displayBounds(String objectName, Node n)
    {
        System.out.println("Bounds for "+objectName);
        System.out.println(n.getBoundsInParent());
        System.out.println(n.getBoundsInLocal());
        System.out.println(n.getLayoutBounds());
        System.out.println();

    }
    private Pane createShapeFlowPane(Color c)
    {
        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(5, 5, 5, 5));
        flowPane.setHgap(5);
        flowPane.setVgap(5);
        for (int i = 0; i  < 40; i++)
        {
            flowPane.getChildren().add(new Rectangle(50, 50 , c));
        }

        return flowPane;
    }
}
