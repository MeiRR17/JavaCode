public class Person {
    String name;
    int age;
    String city;
    String gender;
    static double balance = 0;
    public static void main(String[] args) {
        Person obj1 = new Person();
        Person obj2 = new Person();
        obj1.name ="John";
        obj2.name = "Dessy";
        obj1.age = 35;
        obj2.age = 20;
        obj1.city = "Delhi";
        obj2.city = "Pune";
        obj1.gender = "male";
        obj2.gender = "female";
        System.out.println("obj1's name is: " + obj1.name + ".");
        System.out.println("obj2's name is: " + obj2.name + ".");
        System.out.println("obj1's age is: " + obj1.age + ".");
        System.out.println("obj2's age is: " + obj2.age + ".");
        System.out.println("obj1's city is: " + obj1.city + ".");
        System.out.println("obj2's city is: " + obj2.city + ".");
        System.out.println("obj1's gender is: " + obj1.gender + ".");
        System.out.println("obj2's gender is: " + obj2.gender + ".");
        System.out.println("current balance is: " + obj1.balance + ".");
        obj1.eat();
        obj2.eat();
        obj1.study();
        obj2.study();
        obj1.sleep();
        obj2.sleep();
        obj1.play();
        obj2.play();
        obj1.addBalance(100);
        obj2.addBalance(50);
        obj1.addBalance(20);
        //obj1.balance = ?;

    }



    public void eat(){
        System.out.println(name + " is eating.");
    }
    public void study(){
        System.out.println(name + " is studying.");
    }
    public void sleep(){
        System.out.println(name + " is sleeping.");
    }
    public void play(){
        System.out.println(name + " is playing.");
    }
    public void addBalance (double balance){
        System.out.println("current balance is: " + balance);
    }
    public double printBalance (double balance){
        return balance;
    }
}
