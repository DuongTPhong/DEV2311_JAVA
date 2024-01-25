package kethua;

import lombok.Data;

import java.util.Scanner;

@Data

public class Person {
    private String name;
    private String age;
    private String address;
    static Scanner scanner = new Scanner(System.in);

    void nhap() {
        System.out.println("Nhập name");
        name = scanner.nextLine();
        System.out.println("Nhập age");
        age = scanner.nextLine();
        System.out.println("Nhập address");
        address = scanner.nextLine();
    }

    String xuat() {
        return name + "-" + age + "-" + address;
    }


}
