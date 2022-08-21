public class Person {

    //fields:
    String name;
    int age;
    String city;
    String gender;
    double balance = 0;

    //methods:
    //added object's doing.
    public void eat(){
        System.out.println(name + " is eating.");
    }
    //added object's doing.
    public void study(){
        System.out.println(name + " is studying.");
    }
    //added object's doing.
    public void sleep(){
        System.out.println(name + " is sleeping.");
    }
    //added object's doing.
    public void play(){
        System.out.println(name + " is playing.");
    }
    //added object's balance.
    public void addBalance (double money){
        balance += money;
    }
    //method for printing final balance.
    public void printBalance (){
        System.out.println(name + "'s current balance is: " + balance + "$.");
    }
    //method for returning value.
    public double getBalance (){
        return balance;
    }

    public static void main(String[] args) {
        //created objects.
        Person obj1 = new Person();
        Person obj2 = new Person();
        //named them:
        obj1.name ="John";
        obj2.name = "Dessy";
        //more details about them:
        obj1.age = 35;
        obj2.age = 20;
        obj1.city = "Delhi";
        obj2.city = "Pune";
        obj1.gender = "male";
        obj2.gender = "female";

        //printed:
        System.out.println("obj1's name is: " + obj1.name + ".");
        System.out.println("obj2's name is: " + obj2.name + ".");
        System.out.println("obj1's age is: " + obj1.age + ".");
        System.out.println("obj2's age is: " + obj2.age + ".");
        System.out.println("obj1's city is: " + obj1.city + ".");
        System.out.println("obj2's city is: " + obj2.city + ".");
        System.out.println("obj1's gender is: " + obj1.gender + ".");
        System.out.println("obj2's gender is: " + obj2.gender + ".");
        System.out.println("current balance is: " + obj1.balance + ".");

        //set object's doing:
        obj1.eat();
        obj2.eat();
        obj1.study();
        obj2.study();
        obj1.sleep();
        obj2.sleep();
        obj1.play();
        obj2.play();
        //added to John's balance 100$.
        obj1.addBalance(100);
        //added to Dessy's balance 50$.
        obj2.addBalance(50);
        //added again to John's balance more 20$.
        obj1.addBalance(20);
        //printed objects' final balance:
        obj1.printBalance();
        obj2.printBalance();
    }
}