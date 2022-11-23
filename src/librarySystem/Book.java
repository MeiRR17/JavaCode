package src.librarySystem;

public class Book extends Library{
    //book should have title author year number of pages
    private String title;
    private String author;
    private int yearOfRelease;
    private int numberOfPages;
    public Book(String booksTitle, String booksAuthor, int booksYearOfRelease, int booksNumberOfPages){
        title = booksTitle;
        author = booksAuthor;
        yearOfRelease = booksYearOfRelease;
        numberOfPages = booksNumberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
