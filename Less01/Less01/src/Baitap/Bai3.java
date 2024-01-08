package Baitap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= 8;
        int b = 8;
        int c = (a+b)/2;
//        System.out.println("Nhập điểm Lý thuyết:");
//        int a = sc.nextInt();
//        System.out.println("Nhập điểm thực hành:");
//        int b = sc.nextInt();
        if (a<4) {
            System.out.println("Thi lại lý thuyết");
        }
        if (b < 4) {
                System.out.println("Thi lại Thực hành");
        }
        if (c<4) {
            System.out.println("Sinh viên phải học lại");
        }else if (c>=4 & c<7) {
            System.out.println("Sinh viên đạt môn java");
        }else if ( c>=7) {
            System.out.println("Sinh viên xuất sắc môn java");
        }

    }
}

