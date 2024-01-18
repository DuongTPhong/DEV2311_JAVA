package baitap;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
        System.out.println("Các phần tử là số chẵn:");
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                System.out.println(mang[i]);
            }
        }
    }
}
