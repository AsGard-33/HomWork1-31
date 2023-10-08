package HomeWorkAIT.kontrilnajaRabota;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();//Spisok vseh knig
    private ArrayList<Reader> readers = new ArrayList<>();//Spisok vseh chitatelej

    //Metody dlya dobavlenija/udalenija knig i chitatelej,poisk knig,vidachi i vozvrata knig
    public void addBook(Book book){
        books.add(book);

    }
    public void removeBook(String id){
        Book bookToRemove = findBookById(id);
        if(bookToRemove != null){
            books.remove(bookToRemove);
        }
        else {
            System.out.println("Kniga s id: " + id + "ne najdena");
        }
    }
    // Поиск книг по автору
    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books){
            if (book.getAuthor().equals(author)){
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
    //Vidacha knig
    public void issueBook(String id, Reader reader){
        for (Book book : books) {
            if (book.getId().equals(id)) {
                reader.addBorrowedBook(book);
                break;
            }
        }
    }
    public void returnBook(String id, Reader reader){
        for(Book book : reader.getBorrowedBooks()) {
            if (book.getId().equals(id)) {
                reader.removeBorrowedBook(book);
                break;
            }
        }
    }
    private Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Reader> getReaders() {
        return readers;
    }
}
