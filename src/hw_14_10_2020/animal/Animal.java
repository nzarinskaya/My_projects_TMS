package hw_14_10_2020.animal;

import com.sun.jdi.PathSearchingVirtualMachine;

public abstract class Animal {
    protected String typeOfFood;
    protected String family;
    protected String breed;

    public Animal(String typeOfFood, String family, String breed) {
        this.typeOfFood = typeOfFood;
        this.family = family;
        this.breed = breed;
    }
    public String getTypeOfFood() {
        return typeOfFood;
    }
    public String getFamily() {
        return family;
    }
    public String getBreed() {
        return breed;
    }

    protected abstract void speake();
    protected void run(){
        System.out.println("Бегает");
    }
    protected abstract void displayInfo();


    public static void main(String[] args) {
        Mouse mouse = new Mouse("всеядная,","семейство мышиных,","полевая.");
        mouse.displayInfo();
        mouse.run();
        mouse.speake();
        mouse.toBeEaten();

        Dog dog = new Dog("плотоядная,","семейство псовых,","белая швейцарская овчарка.");
        dog.displayInfo();
        dog.run();
        dog.speake();
        dog.eat();

        Cat cat = new Cat("плотоядная,","семейство кошачьих,","абиссинская.");
        cat.displayInfo();
        cat.run();
        cat.speake();
        cat.eat();
        cat.toBeEaten();
    }
}

