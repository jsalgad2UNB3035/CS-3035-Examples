package MultipleSceneSwitching;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class AnotherScene extends Scene {
    private HBox root;
    private Button button;
    private Text text;

    public static Scene createAnotherScene()
    {
        HBox root = new HBox();
        Scene scene = new AnotherScene(root);

        return scene;
    }

    private AnotherScene(HBox root)
    {
        super(root);
        this.root = root;
        text = new Text("this is another stage!");
        text.setFont(Font.font("Times", FontWeight.BOLD, 20));

        button = new Button("Switch scene");
        button.setOnAction((actionEvent)->{
            Main.view.switchScene();
        });

        root.getChildren().addAll(text, button);

    }
}
