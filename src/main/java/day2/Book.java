package day2;

public class Book {

    private String title;
    private String author;

    private String pages;
    private int year;

    private int rating;


    public Book(String title, String author, String pages, int year, int rating) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public String getPages() {
        return pages;
    }
    public int getYear() {
        return year;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", pages=" + pages + ", year=" + year + '}';
    }

}
