package baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> lstSoNguyen = new ArrayList<>();

        System.out.print("Nhập số phần tử của danh sách: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            int x = Integer.parseInt(scanner.nextLine());
            lstSoNguyen.add(x);
        }
        System.out.println("Danh sách vừa nhập: " + lstSoNguyen);

        Collections.sort(lstSoNguyen);

        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + lstSoNguyen);
    }

}
