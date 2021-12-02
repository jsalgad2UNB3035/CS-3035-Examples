package ClipBoardExample;

import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class MyTextArea extends TextArea {
    private Clipboard clipboard = Clipboard.getSystemClipboard();

    public MyTextArea()
    {
        super();
    }

    @Override
    public void cut()
    {

        ClipboardContent clipboardContent = getMyTextAreaContent();
        clipboard.setContent(clipboardContent);

        System.out.println("TODO cut text");
    }


    @Override
    public void copy()
    {
        ClipboardContent clipboardContent = getMyTextAreaContent();
        clipboard.setContent(clipboardContent);

        System.out.println("copy");
    }
    @Override
    public void paste()
    {
        super.paste();
        System.out.println("paste");
    }


    private ClipboardContent getMyTextAreaContent() {
        final ClipboardContent content = new ClipboardContent();
        content.putString(getSelectedText());
        content.putHtml("<b>"+getSelectedText()+"</b>");
        return content;
    }
}
