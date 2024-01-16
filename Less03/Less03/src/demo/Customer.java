package demo;

import java.util.Scanner;

public class Customer {
    int id;
    String name;
    String adress;
    int age;
    double salary;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Last Name");
        name = scanner.nextLine();

        System.out.println("Adress");
        adress = scanner.nextLine();

        System.out.println("Age");
        age = scanner.nextInt();

        System.out.println("Salary");
        salary = scanner.nextDouble();

    }

    public void viewData() {

        System.out.println("Customer{"
                + "id=" + id
                +",Name="+name
                +",address="+adress
                +",Age="+age
                +",Salary="+salary


        );
    }

    public static void main(String[] args) {
        Customer thuchanh1 = new Customer();


        thuchanh1.input();
        System.out.println("Thuchanh1");
    }

    double calSalary(int bonus) {
        return salary + salary * (bonus / 100);
    }

    double calSalary(double bonus) {
        return salary + bonus;
    }
}