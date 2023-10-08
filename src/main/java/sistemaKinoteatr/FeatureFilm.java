package sistemaKinoteatr;

import java.util.ArrayList;
import java.util.List;

public class FeatureFilm extends Film{
    private String director;

    public FeatureFilm(String title, int duration, String genre, double rating, String director,List<String> mainActors) {
        super(title, duration, genre, rating);
        this.director = director;
        this.mainActors = getMainActors();
    }

    List<String> mainActors = new ArrayList<>();



    @Override
    void showTrailer() {
        System.out.println("nazvanie filma: " + getTitle() + "prodolgitelnost v minutah: " + getDuration() +
                "rejting kartiny: " + getRating() + " ganr filma: " + getGenre() + "regiser: " + director +
                " spisok akterov: " + mainActors);
    }

    public String getDirector() {
        return director;
    }

    public List<String> getMainActors() {
        return mainActors;
    }

    public void setMainActors(List<String> mainActors) {
        this.mainActors = mainActors;
    }
}
