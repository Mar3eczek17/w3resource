import java.util.ArrayList;

class Bookk {
    private String title;
    private String author;
    public Bookk(String title, String author) {
        this.title = title;
        this.author = author;
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
}
class Library {
    private ArrayList<Bookk> books;
    public  Library() {
        books = new ArrayList<Bookk>();
    }
    public void addBook(Bookk bookk) {
        books.add(bookk);
    }
    public void removeBook(Bookk bookk) {
        books.remove(bookk);
    }

    public ArrayList<Bookk> getBooks() {
        return books;
    }
}
public class Main_11 {
    public static void main(String[] args) {
        Library library = new Library();

        Bookk book1 = new Bookk("Adventures of Tom Sawyer", "Mark Twain");
        Bookk book2 = new Bookk("Ben Hur", "Lewis Wallace");
        Bookk book3 = new Bookk("Time Machine", "H.G. Wells");
        Bookk book4 = new Bookk("Anna Karenina", "Leo Tolstoy");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("Books in the library:");
        for (Bookk bookk: library.getBooks()) {
            System.out.println(bookk.getTitle() + " by " + bookk.getAuthor());
        }

        library.removeBook(book2);
        System.out.println("\nBooks in the library after removing " + book2.getTitle() + ":");
        for (Bookk bookk: library.getBooks()) {
            System.out.println(bookk.getTitle() + ' ' + bookk.getAuthor());
        }
    }
}
