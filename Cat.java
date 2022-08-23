public class Cat extends Animal{
    private String breed;
    private String color;

    public Cat(String name, boolean isVegetarian, int numberOfLegs, String breed, String color){
        super(name, isVegetarian, numberOfLegs);
    }
    public void speak(){
        System.out.println("meow meow cat says meow");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
