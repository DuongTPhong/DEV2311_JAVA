package baitap;

import java.util.Scanner;

public class Bai5 {
    public static boolean soNguyenTo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1));
            mang[i] = scanner.nextInt();
        }

        System.out.println("Số nguyên tố trong mảng:");
        for (int i = 0; i < n; i++) {
            if (soNguyenTo(mang[i])) {
                System.out.println(mang[i]);
            }
        }
    }
}
