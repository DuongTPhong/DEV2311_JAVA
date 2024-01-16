package demo;

import java.util.Scanner;

public class Students {
    String firstName;
    String lastName;
    String address;

    public Students(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Students(){}

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First name:");
        firstName = scanner.nextLine();

        System.out.println("Last name:");
        lastName = scanner.nextLine();

        System.out.println("Address:");
        address = scanner.nextLine();

    }
    public void display() {
        String name = lastName + " " + firstName;
        System.out.println("Ten cua hoc sinh:" + name);
        System.out.println("co dia chi:" + address);
    }

    public static void main(String[] args) {
        Students students1 = new Students("Phong", "Duong", "HaNoi");
        Students students2 = new Students();

        students2.input();
        System.out.println("student 1");
        students1.display();
        System.out.println("student 2");
        students2.display();

    }
}
