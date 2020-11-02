package hw_28_10_2020.buyer;

import java.util.*;
import java.lang.Comparable;


public class Main {

    public static void main(String[] args) {

        Buyers first = new Buyers("Milk", "bread", "avocado");
        Buyers second = new Buyers("Cheese", "croissant", "melon");
        Buyers third = new Buyers("Yogurt", "flour", "pepper");

        PriorityQueue<Buyers> queue = new PriorityQueue<>();
            queue.add(first);
            queue.add(second);
            queue.add(third);

            System.out.println("Очередь покупателей" + queue + "\n");

        int counts;
        int sum = 0;

        Random random = new Random();
        int num = 22 + random.nextInt(79);
        int rand = 20 + random.nextInt(81);
        int r = 18 + random.nextInt(83);


        for (Buyers b : queue) {

            if (b.getDairy_products() == "Cheese") {
                counts = 10;
                sum = sum + counts;
                System.out.println("Покупатель у кассы " + b + "\nПродукт - " + b.getDairy_products() + " цена = " + counts + "");

            } else if (b.getDairy_products() == "Milk") {
                counts = 6;
                sum = sum + counts;

                System.out.println("Покупатель у кассы " + b + "\nПродукт - " + b.getDairy_products() + " цена = " + counts);

            } else if (b.getDairy_products() == "Yogurt") {
                counts = 7;
                sum = sum + counts;
                System.out.println("Покупатель у кассы " + b + "\nПродукт - " + b.getDairy_products() + " цена = " + counts);
            }

            if (b.getFlour_products() == "bread") {
                counts = 2;
                sum = sum + counts;
                System.out.println("Продукт - " + b.getFlour_products() + " цена = " + counts);

            } else if (b.getFlour_products() == "croissant") {
                counts = 4;
                sum = sum + counts;
                System.out.println("Продукт - " + b.getFlour_products() + " цена = " + counts);

            } else if (b.getFlour_products() == "flour") {
                counts = 2;
                sum = sum + counts;
                System.out.println("Продукт - " + b.getFlour_products() + " цена = " + counts);
            }

            if (b.getPlant_products() == "avocado") {
                counts = 12;
                sum = sum + counts;
                int change1 = num - sum;
                System.out.println("Продукт - " + b.getPlant_products() + " цена = " + counts +
                        "\nСумма к оплате = " + sum + "\nОплата покупателя: " + num + "\nСдача: " + change1 + "\n");
                sum = 0;

            } else if (b.getPlant_products() == "melon") {
                counts = 8;
                sum = sum + counts;
                int change2 = rand - sum;
                System.out.println("Продукт - " + b.getPlant_products() + " цена = " + counts +
                        "\nСумма к оплате = " + sum + "\nОплата покупателя: " + rand + "\nСдача: " + change2 + "\n");
                sum = 0;

            } else if (b.getPlant_products() == "pepper") {
                counts = 9;
                sum = sum + counts;
                int change3 = r - sum;
                System.out.println("Продукт - " + b.getPlant_products() + " цена = " + counts +
                        "\nСумма к оплате = " + sum + "\nОплата покупателя: " + r + "\nСдача: " + change3 + "\n");
                sum = 0;
            }
        }
    }
}


