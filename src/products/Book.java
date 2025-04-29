package products;

public class Book extends Product {
    private String author;
    private String publication;
    private String genre;
    private static int bookCounter = 0;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title,price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;

    }
    @Override
    public String toString(){
        return super.toString() + " author: " + author + " publication: " + publication + " genre: " + genre;
    }

    @Override
    protected String generateId() {
        bookCounter++;
        return "1" + String.format("%03d", bookCounter);
    }
}
