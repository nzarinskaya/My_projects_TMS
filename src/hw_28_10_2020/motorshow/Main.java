package hw_28_10_2020.motorshow;

import hw_28_10_2020.buyer.Buyers;

import java.rmi.NoSuchObjectException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IncorrectNumberException,NoModelException,IncorrectBrandNameException {
        LinkedList<Car> cars = new LinkedList<>();
        Car chevrolet = new Car("Chevrolet ", "Captiva ", 2011);
        Car toyota = new Car("Toyota ", "Camry ", 2018);
        Car mercedes_benz = new Car("Mercedes-Benz ", "A-Class ", 2019);
        Car skoda = new Car("Skoda ", "Rapid ", 2016);
        Car audi = new Car("Audi ", "A5 ", 2014);

        cars.add(chevrolet);
        cars.add(toyota);
        cars.add(mercedes_benz);
        cars.add(skoda);
        cars.add(audi);

        System.out.println("Введите:\n1 - если хотите добавить машину;\n2 - если хотите получить информацию о машине;\n" +
                "3 - если купить;\n4 - если получить весь список машин.");
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
                System.out.println("Вы добавили машину в автосалон!\n"+cars.peekLast());
                break;
            case 2:
                int number = 0;
                System.out.println("Выберите марку и введите её:");
                for (Car с : cars) {
                    System.out.println(с.getBrand());
                }
                Scanner sc = new Scanner(System.in);
                String brand1 = sc.nextLine();

                switch (brand1){

                    case "Chevrolet": {
                    System.out.println("Марка - " + chevrolet.getBrand() + "\nМодель - " + chevrolet.getModel() + "\nГод выпуска - " + chevrolet.getYearOfIssue());
                }
                break;
                    case "Toyota": {
                    System.out.println("Марка - " + toyota.getBrand() + "\nМодель - " + toyota.getModel() + "\nГод выпуска - " + toyota.getYearOfIssue());
                }
                break;
                case "Mercedes-Benz": {
                    System.out.println("Марка - " + mercedes_benz.getBrand() + "\nМодель - " + mercedes_benz.getModel() + "\nГод выпуска - " + mercedes_benz.getYearOfIssue());
                }
                break;
                    case "Skoda":{
                    System.out.println("Марка - " + skoda.getBrand() + "\nМодель - " + skoda.getModel() + "\nГод выпуска - " + skoda.getYearOfIssue());
                }
                break;
                case "Audi": {
                    System.out.println("Марка - " + audi.getBrand() + "\nМодель - " + audi.getModel() + "\nГод выпуска - " + audi.getYearOfIssue());
                } break;
                    default:
                    throw new IncorrectBrandNameException("Неправильное назание марки или некорректый ввод!");
                }
                break;

            case 3:
                System.out.println("Укажите модель из списка, которую хотите купить:");
                for (Car сar : cars) {
                    System.out.println(сar.getModel());
                }
                    Scanner scanner1 = new Scanner(System.in);
                    String models = scanner1.nextLine();

                    switch (models){
                        case "Captiva":
                        {
                            System.out.println("Вы выбрали "+ chevrolet.getBrand() + chevrolet.getModel() +"- "+chevrolet.getYearOfIssue()+ " года выпуска. Поздравляем с покупкой!");
                        }
                        break;
                        case "Camry":
                        {
                            System.out.println("Вы выбрали "+ toyota.getBrand() + toyota.getModel() +"- "+toyota.getYearOfIssue()+ " года выпуска. Поздравляем с покупкой!");
                        }
                        break;
                        case "A-Class":
                        {
                            System.out.println("Вы выбрали "+ mercedes_benz.getBrand() + mercedes_benz.getModel() +"- "+ mercedes_benz.getYearOfIssue()+ " года выпуска. Поздравляем с покупкой!");
                        }
                        break;
                        case "Rapid":
                        {
                            System.out.println("Вы выбрали "+ skoda.getBrand() + skoda.getModel()+"- " + skoda.getYearOfIssue()+ " года выпуска. Поздравляем с покупкой!");
                        }
                        break;
                        case "A5":
                        {
                            System.out.println("Вы выбрали "+ audi.getBrand() + audi.getModel()+"- " + audi.getYearOfIssue()+ " года выпуска. Поздравляем с покупкой!");
                        }
                        break;
                        default:
                            throw new NoModelException("Такой модели нет в списке или она указана некорректно!");
                    }
                    break;
            case 4:
                System.out.println( chevrolet.getBrand() + chevrolet.getModel() +"- "+chevrolet.getYearOfIssue()+ " года выпуска.");
                System.out.println( toyota.getBrand() + toyota.getModel() +"- "+toyota.getYearOfIssue()+ " года выпуска.");
                System.out.println( mercedes_benz.getBrand() + mercedes_benz.getModel() +"- "+mercedes_benz.getYearOfIssue()+ " года выпуска.");
                System.out.println( skoda.getBrand() + skoda.getModel() +"- "+skoda.getYearOfIssue()+ " года выпуска.");
                System.out.println( audi.getBrand() + audi.getModel() +"- "+audi.getYearOfIssue()+ " года выпуска.");

                break;
                default:
                throw new IncorrectNumberException("Вы ввели неверный номер!");
        }
    }
}
