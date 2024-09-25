package additional1;

public class Book {
    private String title;
    private String author;
    private String lsbn;

    public Book(String title, String author, String lsbn) {
        this.title = title;
        this.author = author;
        this.lsbn = lsbn;
    }


    public String getTitle() {
        return title;
    }

    public String getLsbn() {
        return lsbn;
    }

    public String getAuthor() {
        return author;
    }
}
