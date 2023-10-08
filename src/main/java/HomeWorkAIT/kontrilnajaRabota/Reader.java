package HomeWorkAIT.kontrilnajaRabota;

import java.util.ArrayList;

public class Reader {
    private String name; //Imya chitatelya
    private ArrayList<Book> borrowedBooks = new ArrayList<>();//Spisok vzyatih knig
    public Reader(String name){
        this.name = name;
    }

    //Metody dlya dobavlenija/udalenija vzyatih knig
    public ArrayList<Book> getBorrowedBooks(){

        return borrowedBooks;
    }
    public void addBorrowedBook(Book book){
        borrowedBooks.add(book);
    }
    public void removeBorrowedBook(Book book){
        borrowedBooks.remove(book);
    }
    public  String getName(){
        return name;
    }
}
