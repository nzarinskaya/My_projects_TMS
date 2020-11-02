package hw_28_10_2020.botanist;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> plants = new TreeMap<>();
        plants.put("Берёза", "дерево!");
        plants.put("Черешня", "ягода!");
        plants.put("Лилия", "цветок!");
        plants.put("Алоэ", "кустарник!");
        plants.put("Морковь", "овощ!");
        for (Map.Entry<String, String> item : plants.entrySet()) {
            System.out.println(item.getKey() + " - это " + item.getValue());
        }
        System.out.println("\n"+plants.get("Лилия"));
        System.out.println(plants.get("Берёза"));
    }
}

