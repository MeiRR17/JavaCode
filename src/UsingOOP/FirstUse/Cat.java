package src.UsingOOP.FirstUse;

public class Cat extends Animal {
    private String breed;
    private String color;

    public Cat(String name, boolean isVegetarian, int numberOfLegs, String breed, String color){
        super(name, isVegetarian, numberOfLegs);
        this.breed = breed;
        this.color = color;
    }
    public String speak(){
        return "meow meow cat says meow";
    }
//getters and setters:

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
