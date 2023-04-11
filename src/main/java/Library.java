import java.util.ArrayList;

public class Library {
    ArrayList<Book> books= new ArrayList<>();


    public int numBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public boolean bookInStock(String title) {
        for(Book book:books){
            if (book.getTitle() == title){return true;}
        }
        return false;
    }
}
