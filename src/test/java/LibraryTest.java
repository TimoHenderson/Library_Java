import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void setUp() {
        library = new Library();
        book = new Book("The Hobbit", "JRR Tolkien", "Fantasy");
    }

    @Test
    public void libraryStartsWithNoBooks() {
        assertEquals(0, library.numBooks());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.numBooks());
    }

    @Test
    public void canCheckIfBookIsInStockByTitleTrue() {
        library.addBook(book);
        assertTrue(library.bookInStock("The Hobbit"));
    }

    @Test
    public void canCheckIfBookIsInStockByTitleFalse() {
        library.addBook(book);
        assertFalse(library.bookInStock("The Wobbit"));
    }

    @Test
    public void canGetNumbersOfBooksByGenre() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        Book musicBook = new Book("z", "z", "Music");
        Book sportBook = new Book("z", "z", "Sport");
        library.addBook(musicBook);
        library.addBook(musicBook);
        library.addBook(sportBook);
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Fantasy", 3);
        expected.put("Music", 2);
        expected.put("Sport", 1);
        assertEquals(expected, library.getGenresHashMap());
    }

}
