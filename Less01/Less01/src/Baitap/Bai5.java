package Baitap;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên N: ");
        int N = scanner.nextInt();

        if (isEven(N)) {
            System.out.println(N + " là số chẵn.");
        } else {
            System.out.println(N + " là số lẻ.");
        }

        scanner.close();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
