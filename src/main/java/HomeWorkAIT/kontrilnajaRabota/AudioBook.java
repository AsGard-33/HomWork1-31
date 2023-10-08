package HomeWorkAIT.kontrilnajaRabota;

public class AudioBook extends Book{
    private int duration;//Dlitelnost audioknigi v minutah

    public int getDuration() {
        return duration;
    }


    public AudioBook(String id, String title, String author, String genre, int duration) {
        super(id, title, author, genre);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                "} " + super.toString();
    }
}
