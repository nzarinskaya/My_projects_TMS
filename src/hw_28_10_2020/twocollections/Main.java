package hw_28_10_2020.twocollections;

import java.util.*;


public class Main {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

        Map<Integer, String> playersArsenal = new TreeMap<>();
        playersArsenal.put(2, "Hector Bellerin");
        playersArsenal.put(10, "Mesut Özil");
        playersArsenal.put(9, "Alexandre Lacazette");
        playersArsenal.put(14, "Pierre-Emerick Aubameyang");
        playersArsenal.put(19, "Nicolas Pepe");


        LinkedList<String> names = new LinkedList<>();
        for (Map.Entry<Integer, String> entry : playersArsenal.entrySet()) {
            names.add(entry.getValue());
        }
        System.out.println("Футболисты Arsenal "+names);

       LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        for (Integer key : playersArsenal.keySet()) {
            numbers.add(key);
        }
        System.out.println("Номера игроков "+ numbers);
    }
}
