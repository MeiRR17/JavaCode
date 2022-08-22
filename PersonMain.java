public class PersonMain {

    public static void main(String[] args) {

        //created new objects with Person1's constructors
        Person1 obj1 = new Person1();
        Person1 obj2 = new Person1("Menachem", 23, "Tbilisi","Male", 2022);

        //changed using setter
        obj1.setName("Shmulik");
        obj1.setAge(12);
        obj1.setBalance(21.22);
        obj2.setName("Nahum");
        obj2.setAge(22);
        obj2.setBalance(12212);

        //printed the objects using get methods
        System.out.println(obj1.getName() + " is a " + obj1.getAge() + " " + obj1.getGender() + " man from " + obj1.getCity() + " and his balance is: " + obj1.getBalance() + "$.");
        System.out.println(obj2.getName() + " is a " + obj2.getAge() + " " + obj2.getGender() + " man from " + obj2.getCity() + " and his balance is: " + obj2.getBalance() + "$.");
    }
}
