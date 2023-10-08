package sistemaKinoteatr;

abstract class Film {
    private String title;
    private int duration;
    private String genre;
    private double rating;

    public Film(String title, int duration, String genre, double rating) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.rating = rating;
    }

    abstract void showTrailer();

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }
}
