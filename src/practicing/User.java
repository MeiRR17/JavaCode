package src.practicing;

public class User {
    private String fullName;
    private String username;
    private String password;
    private Book userBook;
    public User(String name, String um, String pass, Book ub){
        fullName = name;
        username = um;
        password = pass;
        userBook = ub;
    }
    public Book getUserBook(){
        return userBook;
    }
    public void setUserBook(Book userBook){
        this.userBook = userBook;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void printUserAndItsBook() {
        System.out.println("Full name is: " + fullName + ".");
        System.out.println("User username is: " + username + ".");
        System.out.println("The password is: " + password + ".");
        System.out.println(getFullName() + " has the book: ");
        userBook.printBook();
    }
}
