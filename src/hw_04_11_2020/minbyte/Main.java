package hw_04_11_2020.minbyte;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import static hw_04_11_2020.minbyte.Min.getMin;

public class Main  {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите путь к файлу!");
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();  //   M://t.txt

        try (FileInputStream fin = new FileInputStream(file)) {
            for (int i = 0; i < fin.available(); i++) {
                byte[] buffer = new byte[fin.available()];
                fin.read(buffer, 0, buffer.length);
                System.out.println(getMin(buffer));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

