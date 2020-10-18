package hw_14_10_2020.animal;

public class Mouse extends Animal implements ToBeEaten {

    public Mouse(String typeOfFood, String family, String breed) {
        super(typeOfFood, family, breed);
    }

    @Override
    protected void speak() {
        System.out.println("Piii ");
    }

    @Override
    protected void displayInfo() {
        System.out.println("Мышь - "+super.getTypeOfFood()+super.family+super.breed);
    }

    @Override
    public void toBeEaten() {
        System.out.println("Съедена собакой или котом ");
    }
}
