package sistemaKinoteatr;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String film;

    public Cinema(String film) {
        this.film = film;
    }

    public String getFilm() {
        return film;
    }

    List<Film> filmsOnShow = new ArrayList<>();
    void addFilm(Film title){
        filmsOnShow.add(title);
    }
    void removwFilm(Film film){
        filmsOnShow.remove(film);
    }
    public void showFilmInfo(Film film){
        System.out.println("nazvanie filma: " + film.getTitle() + "prodolgitelnost v minutah: " + film.getDuration() +
                "rejting kartiny: " + film.getRating() + " ganr filma: " + film.getGenre());

    }

}
