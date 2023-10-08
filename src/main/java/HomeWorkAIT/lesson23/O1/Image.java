package HomeWorkAIT.lesson23.O1;

public class Image implements Saveable{
    @Override
    public void save() {
        System.out.println("image saved");
    }

    @Override
    public void load() {
        System.out.println("image loading");

    }
}
