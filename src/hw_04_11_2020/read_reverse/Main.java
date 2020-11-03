package hw_04_11_2020.read_reverse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main extends Reverse {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("M://t.txt"))) {
            String str;
            Reverse r = new Reverse();
            while ((str = br.readLine()) != null) {
                System.out.println(r.front(str));
                System.out.println(r.reverse(str));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

