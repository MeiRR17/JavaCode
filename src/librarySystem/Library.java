package src.librarySystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        ArrayList<User> registered = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        System.out.println("welcome to the library.");
        int counter = 3;
        while (true) {
            System.out.println("Sign in for current users or register.");

            String signInOrRegister = in.nextLine().toLowerCase();
            System.out.println(signInOrRegister);
            if (signInOrRegister.equals("sign in")) {
                ArrayList<User> signIn = new ArrayList<>();
                System.out.println("Enter your account username:");
                String signFullName = in.nextLine();
                System.out.println("Enter your account username:");
                String signUserName = in.nextLine();
                System.out.println("Enter your password: ");
                String signPassword = in.nextLine();

                signIn.add(new User(signFullName, signUserName, signPassword));

                for(int index = 0;index< registered.size();index++){
                    if(signIn==registered){
                        break;
                    }else{
                        System.out.println("Your password, username or fullName is not on the system, please try again.");
                    }
                }
                counter--;

                if (counter == 0) {
                    System.out.println("Your account has been locked due to too many attempts...\nPlease try again later.");
                    System.exit(400);
                }
            } else if (signInOrRegister.equals("register")) {
                System.out.println("Enter your full name: ");
                String registerFullName = in.nextLine();
                System.out.println("Enter a username: ");
                String registerUserName = in.nextLine();
                System.out.println("Enter a password: ");
                String registerPassword = in.nextLine();

                registered.add(new User(registerFullName, registerUserName, registerPassword));

                System.out.println("Okay, your account has been created.");

            } else {
                System.out.println("Could not understand that...");
            }
        }
    }
}
