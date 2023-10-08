package HomeWorkAIT.lesson31;

public class Book extends Product{
    private String author;
    private String genre;
    private int yearPublished;

    public Book(int id, String name, float price, String description, String author, String genre, int yearPublished) {
        super(id, name, price, description);
        this.author = author;
        this.genre = genre;
        this.yearPublished = yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    void displayInfo() {
        System.out.println("id: " + getId() + " ,nazvanie produkta: " + getName() + " ,stoimost: " +
                getPrice() + " $, opisanie produkta: " + getDescription() + ", avtor: " + author +
                ", ganr knigi: " + genre + ", god izdanija: " + yearPublished );
    }
}
