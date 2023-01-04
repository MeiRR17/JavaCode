package src.UsingOOP.FirstUse;

interface JavaCode{
    void dogSound();
}
public class Dog implements JavaCode{
    private String breed;
    private String color;


    public void speak(){
        System.out.println("waif waif dog is barking");
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

    public void dogSound() {
        System.out.println("waif waif");
    }
}
