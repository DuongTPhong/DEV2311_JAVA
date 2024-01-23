package baitap.bai5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Map<Integer, Product> productMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập thông tin cho sản phẩm thứ " + i + ":");
            System.out.print("ID: ");
            String proId = scanner.next();

            System.out.print("Tên sản phẩm: ");
            String proName = scanner.next();

            System.out.print("Nhà sản xuất: ");
            String producer = scanner.next();

            System.out.print("Năm sản xuất: ");
            int yearMaking = scanner.nextInt();

            System.out.print("Giá sản phẩm: ");
            float price = scanner.nextFloat();

            Product product = new Product(proId, proName, producer, yearMaking, price);
            productMap.put(yearMaking, product);
        }

        System.out.println("\nThông tin sản phẩm vừa nhập:");
        for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
