package HomeWorkAIT.lesson23.O1;

public class TextDocument implements Saveable{
    public TextDocument() {
    }

    @Override
    public void save() {
        System.out.println("Dokument sohranen");
    }

    @Override
    public void load() {
        System.out.println("Dokument zagrugen");

    }
}
