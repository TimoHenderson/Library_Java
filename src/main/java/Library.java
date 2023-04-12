import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private final ArrayList<Book> books= new ArrayList<>();

    public int numBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public boolean bookInStock(String title) {
        for(Book book:books){
            if (book.getTitle().equals( title)){return true;}
        }
        return false;
    }

    public HashMap<String,Integer> getGenresHashMap() {
        HashMap<String,Integer> numBooksByGenre = new HashMap<>();
        for(Book book: books){
            String genre = book.getGenre();
            numBooksByGenre.computeIfPresent(genre,(k,v)-> v + 1);
            numBooksByGenre.putIfAbsent(genre, 1);
        }
        return numBooksByGenre;
    }
}
