package hw_04_11_2020.domain_name;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите доменное имя");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

           // http://example.com/
        // example.com
        boolean address = Pattern.matches("^http"+"s?"+"://{1}"+"[a-z0-9_-]{1,29}"+"\\.{1}"+"[a-z]{1,7}"+".*$", str);
        if (address == true) {
            System.out.println("Адрес введён в верном формате!");
        } else {
            System.out.println("Неверный формат адреса!");
        }
    }
}
