package baitap;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }

        int max = mang[0];
        int min = mang[0];

        for (int i = 1; i < n; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        System.out.println("Phần tử lớn nhất : " + max);
        System.out.println("Phần tử nhỏ nhất : " + min);
    }
}
