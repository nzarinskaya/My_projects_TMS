package hw_04_11_2020.write_reverse;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (FileWriter w = new FileWriter("M://t.txt", true)) {

            System.out.println("Введите что-нибудь");
            Scanner s = new Scanner(System.in);
            String choice = s.nextLine();

            StringBuilder strBuilder = new StringBuilder(choice);
            strBuilder.reverse();
            w.write(strBuilder.toString());
            System.out.println("Строка записана наоборот " + strBuilder);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
