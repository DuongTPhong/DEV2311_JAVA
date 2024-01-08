package Baitap;

import java.util.Scanner;

public class Bai8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập vào tháng: ");
            int month = scanner.nextInt();

            // Kiểm tra và in ra số ngày của tháng
            int daysInMonth = getDaysInMonth(month);
            if (daysInMonth != -1) {
                System.out.println("Tháng " + month + " có " + daysInMonth + " ngày.");
            } else {
                System.out.println("Tháng không hợp lệ.");
            }
        }

        private static int getDaysInMonth(int month) {
            if (month >= 1 && month <= 12) {
                switch (month) {
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 2:
                        return isLeapYear() ? 29 : 28;
                }
            }
            return -1;
        }

        // Kiểm tra năm nhuận
        private static boolean isLeapYear() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập vào năm: ");
            int year = scanner.nextInt();

            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
}
