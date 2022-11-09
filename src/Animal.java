package src;

public abstract class Animal {
    private String name;
    private boolean isVegetarian;
    private int numberOfLegs;



    //non parameter constructor
    public Animal(){
        name = "Unknown";
        numberOfLegs = 0;
    }
    //parameter constructor
    public Animal(String name, boolean isVegetarian, int numberOfLegs) {
        this.name = name;
        this.isVegetarian = isVegetarian;
        this.numberOfLegs = numberOfLegs;
    }



    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}

