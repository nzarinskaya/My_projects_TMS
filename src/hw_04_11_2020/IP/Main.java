package hw_04_11_2020.IP;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите IP адрес");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

// 127.0.0.1  255.255.255.0
        boolean ip = Pattern.matches("^\\d{3}." + "\\d{1,3}." + "\\d{1,3}." + "\\d{1}$", str);
        if (ip == true) {
            System.out.println("IP адрес введен верно!");
        } else {
            System.out.println("IP адрес введен неверно!");
        }
    }
}

