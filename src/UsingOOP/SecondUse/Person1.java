package src.UsingOOP.SecondUse;

public class Person1 {

    //fields:
    private String name;
    private int age;
    private String city;
    private String gender;
    private double balance;

    //Added constructor.
    public Person1(){
        name = "Unknown";
        age = 0;
        city = "Unknown";
        gender = "Unknown";
        balance = 0;
    }
    public Person1(String name, int age, String city, String gender, double balance){
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
        this.balance = balance;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }
    public double getBalance(){
        return balance;
    }
}