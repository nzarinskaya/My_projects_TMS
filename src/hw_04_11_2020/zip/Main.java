package hw_04_11_2020.zip;

import java.io.*;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {

        File dir = new File("M://Dir");
        boolean cr = dir.mkdir();
        if (cr) {
            System.out.println("Создан каталог " + dir.getName());
        } else {
            System.out.println("Не удалось создать каталог");
        }
        //file1
        File file1 = new File("M://Dir//newFile1");
        try {
            boolean cr1 = file1.createNewFile();
            if (cr1) {
                System.out.println("Файл №1 создан!");
            }
            try (FileWriter fw = new FileWriter("M://Dir//newFile1")) {
                System.out.println("Запишите в файл №1 что-нибудь");
                Scanner s = new Scanner(System.in);
                String choice = s.nextLine();
                fw.write(choice);
                fw.close();
                System.out.println("В файл №1 записано - " + choice + "\n");

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //file2
        File file2 = new File("M://Dir//newFile2");
        try {
            boolean cr2 = file2.createNewFile();
            if (cr2) {
                System.out.println("Файл №2 создан!");
            }

            try (FileWriter fw = new FileWriter("M://Dir//newFile2")) {
                System.out.println("Запишите в файл №2 что-нибудь");
                Scanner s = new Scanner(System.in);
                String choice = s.nextLine();
                fw.write(choice);
                fw.close();
                System.out.println("В файл №2 записано - " + choice + "\n");

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //file3
        File file3 = new File("M://Dir//newFile3");
        try {
            boolean cr3 = file3.createNewFile();
            if (cr3) {
                System.out.println("Файл №3 создан");
            }

            try (FileWriter fw = new FileWriter("M://Dir//newFile3")) {
                System.out.println("Запишите в файл №3 что-нибудь");
                Scanner s = new Scanner(System.in);
                String choice = s.nextLine();
                fw.write(choice);
                fw.close();
                System.out.println("В файл №3 записано - " + choice + "\n");

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //архивируем file 1
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("M://Dir//zip"));
             FileInputStream fis = new FileInputStream("M://Dir//newFile1");) {
            ZipEntry entry1 = new ZipEntry("newFile1");
            zos.putNextEntry(entry1);

            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zos.write(buffer);
            zos.closeEntry();
            fis.close();
            System.out.println("newFile1 заархивирован в архив zip");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        //архивируем file 2
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("M://Dir//zip"));
             FileInputStream fis = new FileInputStream("M://Dir//newFile2");) {
            ZipEntry entry2 = new ZipEntry("newFile2");
            zos.putNextEntry(entry2);

            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zos.write(buffer);
            zos.closeEntry();
            fis.close();
            System.out.println("newFile2 заархивирован в архив zip");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        //архивируем file 3
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("M://Dir//zip"));
             FileInputStream fis = new FileInputStream("M://Dir//newFile3");) {
            ZipEntry entry3 = new ZipEntry("newFile3");
            zos.putNextEntry(entry3);

            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zos.write(buffer);
            zos.closeEntry();
            fis.close();
            System.out.println("newFile3 заархивирован в архив zip\n");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        File dirRename = new File("M://DirRenamed");
        boolean rename = dir.renameTo(dirRename);
        if (rename) {
            System.out.println("Каталог переименован на " + dirRename.getName() + "!\n");
        }
        for (File f : dirRename.listFiles()) {
            if (f.isDirectory()) {
                System.out.println("В каталог " + dirRename.getName() + " входит каталог - " + f.getName());
            } else {
                System.out.println("В каталог " + dirRename.getName() + " входит файл - " + f.getName());
            }
        }
        boolean deleted = dirRename.delete();

        if (deleted) {
            System.out.println("Каталог DirRename удален!");
        } else {
            System.out.println("Каталог DirRename не удален!");
        }
    }
}



