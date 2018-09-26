import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;
    Book book3;
    ArrayList collection;

    @Before
    public void setUp() {
        book1 = new Book("Annihilation", "Jeff VanderMeer","Sci Fi");
        book2 = new Book("Authority", "Jeff VanderMeer","Sci Fi");
        book3 = new Book("Acceptance", "Jeff VanderMeer","Sci Fi");
        collection = new ArrayList<>();
        library = new Library(collection, 2);
    }

    @Test
    public void canCountBooks() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void cannotAddBooksIfFull() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.countBooks());

    }
}
