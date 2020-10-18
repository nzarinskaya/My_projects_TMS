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

    protected abstract void speak();
    protected void run(){
        System.out.println("Бегает");
    }
    protected abstract void displayInfo();
}

