package HomeWorkAIT.kontrilnajaRabota;
/*Вы разрабатываете систему управления для небольшой библиотеки. Вашей системе нужно
уметь обрабатывать обычные книги и аудиокниги. Система должна позволять читателям
брать книги, возвращать их, а также делать поиск по каталогу.*/
public class Book {
    private String id;//Identifikator knigi
    private String title;//Nazvanie knigi
    private String author;//Avtor knigi
    private String genre;//Ganr knigi
   public String dueDate;//Data,kogda knigu nugno vernut(opcionalno)

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Book(String id, String title, String author, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", dueDate='" + dueDate + '\'' +
                '}';
    }
}
