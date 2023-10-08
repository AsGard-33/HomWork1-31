package HomeWorkAIT.lesson19;
/* Создайте класс Book с полями: автор, название, количество страниц и методом read(),
 который выводит сообщение о том, что книгу читают.*/
public class Book {
    public String avtor;

    public String nazavanije;

    public int kollichestvoStranic;

    public Book(String avtor, String nazavanije, int kollichestvoStranic) {
        this.avtor = avtor;
        this.nazavanije = nazavanije;
        this.kollichestvoStranic = kollichestvoStranic;
    }

    public void read() {

        System.out.println("Populyarnaja kniga: " + nazavanije + " '" + avtor + "' " + kollichestvoStranic + " stranic");
    }
    public static void main(String[]args){
        Book book = new Book("J.K. Rowling", "Harry Poter and Chamber of Secrets",368 );

        book.read();
    }
}
