public class Book {
    private final String title;
    private final String author;
    private final String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author= author;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }
}
