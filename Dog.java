public class Dog extends Animal{
    private String breed;
    private String color;

    public Dog(String name, boolean isVegetarian, int numberOfLegs, String breed, String color){
        super(name, isVegetarian, numberOfLegs);
    }
    public void speak(){
        System.out.println("wauf wauf dog is barking");
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
