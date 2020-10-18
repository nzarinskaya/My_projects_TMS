package hw_14_10_2020.animal;


public class Dog extends Animal implements Eat {
    public Dog(String typeOfFood, String family, String breed) {
        super(typeOfFood, family, breed);
    }
    @Override
    protected void speak() {
        System.out.println("Gaw ");
    }

    @Override
    protected void displayInfo() {
        System.out.println("\n"+"Собака - "+super.getTypeOfFood()+super.family+super.breed);
    }
    @Override
    public void eat() {
        System.out.println("Съел кошку или мышь ");
    }
}
