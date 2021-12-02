package CustomLayoutPane;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class MyCustomPane2 extends Pane {

    public MyCustomPane2()
    {
        super();
        this.setBackground(new Background(new BackgroundFill(Color.FORESTGREEN, new CornerRadii(5), new Insets(10))));
    }

    @Override
    public void layoutChildren()
    {
        super.layoutChildren();

        this.setHeight(this.getWidth());
    }
}
