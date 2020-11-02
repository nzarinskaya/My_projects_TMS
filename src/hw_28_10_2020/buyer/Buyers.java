package hw_28_10_2020.buyer;

import java.util.Comparator;
import java.util.LinkedList;

public class Buyers implements Comparable<Buyers> {

    String dairy_products;
    String flour_products;
    String plant_products;

    public Buyers() {
    }

    @Override
    public String toString() {
        return "Buyers(" + dairy_products + ", " +
                flour_products + ", " + plant_products +
                ")";
    }
    public Buyers(String dairy_products, String flour_products, String plant_products) {
        this.dairy_products = dairy_products;
        this.flour_products = flour_products;
        this.plant_products = plant_products;

    }
    public String getFlour_products() {
        return flour_products;
    }

    public String getPlant_products() {
        return plant_products;
    }

    public String getDairy_products() {
        return dairy_products;
    }

    @Override
    public int compareTo(Buyers b) {
        return dairy_products.compareTo(b.getDairy_products());
    }

}




