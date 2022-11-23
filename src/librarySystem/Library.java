package src.librarySystem;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        ArrayList<User> registered = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String currentUserName = "";
        System.out.println("welcome to the library.");
        int counter = 3;
        while (true) {
            System.out.println("Sign in for current users or register.");

            String signInOrRegister = in.nextLine().toLowerCase();

            if (signInOrRegister.equals("sign in")) {
                System.out.println("Enter your account username:");
                String signUserName = in.nextLine();
                System.out.println("Enter your password: ");
                String signPassword = in.nextLine();

                boolean breakLoop = true;
                for (User user : registered) {
                    if (signUserName.equals(user.getUsername())&&signPassword.equals(user.getPassword())) {
                        breakLoop = false;
                        currentUserName = user.getFullName();
                        break;
                    } else {
                        System.out.println("Your password, username or fullName is not on the system, please try again.");
                    }
                }
                //way out of loop if username & password was correct
                if(!breakLoop){
                    break;
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
        if(timeInDay()>=12&&timeInDay()<17){
            System.out.println("Good afternoon " + currentUserName + ".");
        }else if(timeInDay()>=17&&timeInDay()<21){
            System.out.println("Good evening " + currentUserName + ".");
        }else if(timeInDay()>=21&&timeInDay()<5){
            System.out.println("Good night " + currentUserName + ".");
        }else{
            System.out.println("Good morning " + currentUserName + ".");
        }
        System.out.println("Welcome to Library System.");

    }
    public static int timeInDay() {
        LocalTime time = LocalTime.now();
        return time.getHour();
    }
}
