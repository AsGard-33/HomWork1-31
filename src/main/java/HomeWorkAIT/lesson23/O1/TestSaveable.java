package HomeWorkAIT.lesson23.O1;

public class TestSaveable {
    public static void main(String[] args) {
        TextDocument textDocument = new TextDocument();
        Image image = new Image();

        textDocument.save();
        textDocument.load();

        image.save();
        image.load();
    }


}
