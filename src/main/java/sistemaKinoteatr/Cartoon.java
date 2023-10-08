package sistemaKinoteatr;

public class Cartoon extends  Film{
    private String animationType;

    public Cartoon(String title, int duration, String genre, double rating, String animationType) {
        super(title, duration, genre, rating);
        this.animationType = animationType;
    }

    @Override
    void showTrailer() {
        System.out.println("nazvanie filma: " + getTitle() + "prodolgitelnost v minutah: " + getDuration() +
                "rejting kartiny: " + getRating() + " ganr filma: " + getGenre() +
                "Этот мультфильм создан в технике: " + animationType);

    }
}
