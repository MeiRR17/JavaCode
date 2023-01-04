package src.practicing;

public class Book {



    private String title;
    private String author;
    private int yearOfRelease;
    private int numberOfPages;


    public Book (String booksTitle, String booksAuthor, int booksYearOfRelease, int booksNumberOfPages){
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


    public void printBook() {
        System.out.println("Book title is: " + title + ".");
        System.out.println("Book author is: " + author + ".");
        System.out.println("Book yearOfRelease is: " + yearOfRelease + ".");
        System.out.println("Book number of pages is: " + numberOfPages +".");
    }
}
