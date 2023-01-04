package src.practicing;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Book book = new Book("title", "Artur", 1999, 123);
        Book book1 = new Book("title1", "Artur1", 1998, 1234);
        Book book2 = new Book("title2", "Artur2", 1997, 122);
        Book book3 = new Book("title3", "Artur3", 1996, 132);

        User user = new User("Shalom", "me", "123", book);
        User user1 = new User("Shalom", "me", "123", book1);
        User user2 = new User("Shalom", "me", "123", book2);
        User user3 = new User("Shalom", "me", "123", book3);

        ArrayList<User> users = new ArrayList<>();
        String exitLoop = "";
        while(!exitLoop.equals("exit")) {

            System.out.println("Enter your full name: ");
            String registerFullName = in.nextLine();
            System.out.println("Enter a username: ");
            String registerUserName = in.nextLine();
            System.out.println("Enter a password: ");
            String registerPassword = in.nextLine();
            users.add(new User(registerFullName, registerUserName, registerPassword, new Book(null, null, 0, 0)));
            System.out.println("If you want to exit type exit");
            exitLoop = in.nextLine();
        }
        for (User indexOfAL : users) {
            indexOfAL.printUserAndItsBook();
        }
    }
}
