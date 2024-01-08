package Baitap;

import java.util.Scanner;

public class Bai6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập vào ba số nguyên a, b, c
            System.out.print("Nhập vào số a: ");
            int a = scanner.nextInt();
            System.out.print("Nhập vào số b: ");
            int b = scanner.nextInt();
            System.out.print("Nhập vào số c: ");
            int c = scanner.nextInt();

            // Kiểm tra xem a, b, c có tạo thành tam giác hay không
            if (isTriangle(a, b, c)) {
                System.out.println("Ba số " + a + ", " + b + ", " + c + " tạo thành một tam giác.");

                // Tính diện tích và chu vi của tam giác
                double area = calculateTriangleArea(a, b, c);
                double perimeter = calculateTrianglePerimeter(a, b, c);

                System.out.println("Diện tích tam giác là: " + area);
                System.out.println("Chu vi tam giác là: " + perimeter);
            } else {
                System.out.println("Ba số " + a + ", " + b + ", " + c + " không tạo thành tam giác.");
            }
        }

        // Hàm kiểm tra xem ba số a, b, c có tạo thành tam giác hay không
        private static boolean isTriangle(int a, int b, int c) {
            return (a > 0 && b > 0 && c > 0) && (a + b > c) && (b + c > a) && (c + a > b);
        }

        // Hàm tính diện tích tam giác theo công thức Heron
        private static double calculateTriangleArea(int a, int b, int c) {
            double s = (a + b + c) / 2.0;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        // Hàm tính chu vi tam giác
        private static double calculateTrianglePerimeter(int a, int b, int c) {
            return a + b + c;
        }
}
