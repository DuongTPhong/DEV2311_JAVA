package baitap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bai3 {
    public static void main(String[] args) {
        Map<Integer, String> countryMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng quốc gia: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập tên quốc gia thứ " + i + ":");
            String countryName = scanner.next();
            countryMap.put(i, countryName);
        }

        System.out.println("Danh sách quốc gia vừa nhập:");
        for (Map.Entry<Integer, String> entry : countryMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
