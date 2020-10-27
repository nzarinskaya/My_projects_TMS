package hw_28_10_2020.motorshow;

import hw_28_10_2020.buyer.Buyers;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<>();
        cars.add(new Car("Chevrolet ", "Captiva ", 2011));
        cars.add(new Car("Toyota ", "Camry ", 2018));
        cars.add(new Car("Mercedes-Benz ", "A-Class ", 2019));
        cars.add(new Car("Skoda ", "Rapid ", 2016));
        cars.add(new Car("Audi ", "A5", 2014));


        System.out.println("Введите 1 - если хотите добавить машину.\n2 - если хотите получить информацию по машине.\n" +
                "3 - если купить.\n4 - если получить весь список машин.");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите марку, модель и год выпуска");
                Scanner s = new Scanner(System.in);
                String brand = s.nextLine();
                Scanner scan = new Scanner(System.in);
                String model = scan.nextLine();
                Scanner scanner = new Scanner(System.in);
                int year = scanner.nextInt();

                cars.add(new Car(brand, model, year));
                break;
            case 2:
                System.out.println("Выберите марку из списка и введите ee");
                for (Car b : cars) {
                    System.out.println(b.getBrand());

                    Scanner sc = new Scanner(System.in);
                    String brand1 = sc.nextLine();

                    if (brand1 == "Chevrolet") {
                        System.out.println();
                    }
                }
        }
    }
}