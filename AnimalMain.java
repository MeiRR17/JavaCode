public class AnimalMain {
    public static void main(String[] args) {

        //created objects
        //Animal animalObject = new Animal("Jonathan", false, 4);
//        Dog dogObject = new Dog("Moshe", false, 3, "AmericanFoxhound", "white, brown and black");
        Dog InterfaceDogObject = new Dog() {
        };
        Cat catObject = new Cat("Moshiko", true, 2, "Bombay", "black");

        //printed Animal properties
//        if(animalObject.isVegetarian()) {
//            System.out.println(animalObject.getName() + " is an animal who is a vegetarian and he has " + animalObject.getNumberOfLegs() + " legs.");
//        }else{
//            System.out.println(animalObject.getName() + " is an animal who is not a vegetarian and he has " + animalObject.getNumberOfLegs() + " legs.");
//        }
        //printed Dog properties
//        if(dogObject.isVegetarian()) {
//            System.out.println(dogObject.getName() + " is an " + dogObject.getBreed() + " dog who is a vegetarian, his color is " + dogObject.getColor() + " and he has " + dogObject.getNumberOfLegs() + " legs.");
//        }else{
//            System.out.println(dogObject.getName() + " is an " + dogObject.getBreed() + " dog who is not a vegetarian, his color is " + dogObject.getColor() + " and he has " + dogObject.getNumberOfLegs() + " legs.");
//        }
        //printed Cat properties
        if(catObject.isVegetarian()) {
            System.out.println(catObject.getName() + " is an " + catObject.getBreed() + " dog who is a vegetarian, his color is " + catObject.getColor() + " and he has " + catObject.getNumberOfLegs() + " legs.");
        }else{
            System.out.println(catObject.getName() + " is an " + catObject.getBreed() + " dog who is not a vegetarian, his color is " + catObject.getColor() + " and he has " + catObject.getNumberOfLegs() + " legs.");
        }

InterfaceDogObject.dogSound();
        //System.out.println(dogObject.speak() + ".");
//        System.out.println(catObject.speak() + ".");
    }
}