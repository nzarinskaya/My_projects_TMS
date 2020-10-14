package hw_14_10_2020.animal;

public class Cat extends Animal implements ToBeEaten, Eat {
    public Cat(String typeOfFood, String family, String breed) {
        super(typeOfFood, family, breed);
    }

    @Override
    protected void speake() {
        System.out.println("Myaooo ");
    }

    @Override
    protected void displayInfo() {
        System.out.println("\n" + "Кошка - " + super.getTypeOfFood() + super.family + super.breed);
    }

    @Override
    public void toBeEaten() {
        System.out.println("Съедена собакой ");
    }

    @Override
    public void eat() {
        System.out.println("Съела мышь ");
    }
}
