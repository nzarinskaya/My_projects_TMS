package hw_04_11_2020.date;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите дату в формате YYYY/MM/DD HH:MM:SS");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        // 2019/11/15 13:00:00
        boolean date = Pattern.matches("^\\d+/" + "\\d+/" + "\\d+" + "\\s" + "\\d+:" + "\\d+:" + "\\d+$", s);
        if (date == true) {
            System.out.println("Вы ввели дату в верном формате!");
        } else {
            System.out.println("Вы ввели дату в неверном формате!");
        }
    }
}
