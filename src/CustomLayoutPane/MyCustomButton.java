package CustomLayoutPane;

import javafx.scene.control.Button;

public class MyCustomButton extends Button {
    public MyCustomButton(String text)
    {
        super(text);
    }

    @Override
    public void layoutChildren()
    {
        super.layoutChildren();
        System.out.println("layout children in "+getText());
    }
}
