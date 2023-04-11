import org.junit.Before;

public class BookTest {
    Book book;
    @Before
    public void setUp(){
        book = new Book("The Hobbit","JRR Tolkien", "Fantasy");
    }
}
