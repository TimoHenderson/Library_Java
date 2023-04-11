import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library ;
    Book book;
    @Before
    public void setUp(){
        library = new Library();
        book = new Book("The Hobbit", "JRR Tolkien","Fantasy");
    }

    @Test
    public void libraryStartsWithNoBooks(){
        assertEquals(0,library.numBooks());
    }
    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1,library.numBooks());
    }

}
