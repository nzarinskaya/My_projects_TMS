package hw_07_10_2020;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private String dateOfBirthday;
    private int course;

    public Student(String name, String surname, String dateOfBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Ivan", 2));
        list.add(new Student("Egor", 2));
        list.add(new Student("Yan", 1));
        list.add(new Student("Dmitriy", 1));
        list.add(new Student("Max", 2));

        int course = 1;
        printStudents(list, course);

        course = 2;
        printStudents(list, course);
    }
    private static void printStudents(List<Student> list, int course) {
        System.out.println("Студенты " + course + " курса:");
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getCourse() == course) {
                System.out.println(list.get(i).getName());
            }
        }
    }
}
