package hw_14_10_2020.animal;

public class Application {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("всеядная,","семейство мышиных,","полевая.");
        mouse.displayInfo();
        mouse.run();
        mouse.speak();
        mouse.toBeEaten();

        Dog dog = new Dog("плотоядная,","семейство псовых,","белая швейцарская овчарка.");
        dog.displayInfo();
        dog.run();
        dog.speak();
        dog.eat();

        Cat cat = new Cat("плотоядная,","семейство кошачьих,","абиссинская.");
        cat.displayInfo();
        cat.run();
        cat.speak();
        cat.eat();
        cat.toBeEaten();
    }
}
