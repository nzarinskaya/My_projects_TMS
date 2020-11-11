package hw_04_11_2020.maxbyte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static hw_04_11_2020.maxbyte.Max.getMax;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите путь к файлу!");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();  //   M://t.txt

        try (FileInputStream fin = new FileInputStream(name)) {
            for (int i = 0; i < fin.available(); i++) {
                byte[] buffer = new byte[fin.available()];
                fin.read(buffer, 0, buffer.length);
                System.out.println(getMax(buffer));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

