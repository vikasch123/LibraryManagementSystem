package models;

public class Book {
    private int id;
    private String title;
    private String Author;
    private float rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Book(int id, String title, String author, float rating) {
        this.id = id;
        this.title = title;
        this.Author = author;
        this.rating = rating;
    }
    public Book()
    {

    }
}
