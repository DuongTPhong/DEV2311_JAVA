package baitap;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> citiSet = new HashSet<>();

        System.out.print("Nhập số thành phố: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhập tên thành phố:");
        for (int i = 0; i < n; i++) {
            System.out.print("Thành phố thứ " + (i + 1) + ": ");
            String cityName = scanner.nextLine();
            citiSet.add(cityName);
        }
        System.out.println("Danh sách vừa nhập: " + citiSet);


    }
}
