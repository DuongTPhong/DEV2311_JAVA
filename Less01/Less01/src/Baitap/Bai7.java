package Baitap;

import java.util.Scanner;

public class Bai7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập vào 4 số nguyên
            System.out.print("Nhập số thứ nhất: ");
            int a = scanner.nextInt();

            System.out.print("Nhập số thứ hai: ");
            int b = scanner.nextInt();

            System.out.print("Nhập số thứ ba: ");
            int c = scanner.nextInt();

            System.out.print("Nhập số thứ tư: ");
            int d = scanner.nextInt();

            // Tìm và in ra số lớn nhất
            int maxAB = findMaxNumber(a, b);
            int maxCD = findMaxNumber(c, d);
            int maxOverall = findMaxNumber(maxAB, maxCD);

            System.out.println("Số lớn nhất là: " + maxOverall);
        }

        // Hàm tìm số lớn nhất giữa hai số nguyên
        private static int findMaxNumber(int x, int y) {
            return (x > y) ? x : y;
        }
}
