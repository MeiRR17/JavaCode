public class Person1 {
    public Person1(String name, int age, String city, String gender, double balance){
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
        this.balance = balance;
    }
    public Person1(){
        name = "Unknown";
        age = 0;
        city = "Unknown";
        gender = "Unknown";
        balance = 0;
    }
    public static void main(String[] args) {



        Person1 Menachem = new Person1();
        Person1 Shmulik = new Person1("Shmulik", 12, "Beher", "Male", 23033.2);


        Menachem.setName("Menachem");
        Menachem.setAge(53);
        Menachem.setCity("Lump");
        Menachem.setGender("Male");
        Menachem.setBalance(400);

        System.out.println(Menachem.getName());
        System.out.println(Menachem.getAge());
        System.out.println(Menachem.getCity());
        System.out.println(Menachem.getGender());
        System.out.println(Menachem.getBalance());

        System.out.println(Shmulik.getName + Shmulik.getAge + Shmulik.getCity + Shmulik.getGender + Shmulik.getBalance);

    }

}
