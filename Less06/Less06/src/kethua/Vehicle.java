package kethua;

import lombok.Data;

import java.util.Scanner;

@Data
public class Vehicle {
    private String color;
    private String price;
    private String brand;
    private String name;
    static Scanner scanner = new Scanner(System.in);

    void nhap() {
        System.out.println("Nhập color");
        color = scanner.nextLine();
        System.out.println("Nhập price");
        price = scanner.nextLine();
        System.out.println("Nhập brand");
        brand = scanner.nextLine();
        System.out.println("Nhập name");
        name = scanner.nextLine();
    }

    String xuat() {
        return  color + "-" + price + "-" + brand + "-"+ name;
    }

}
