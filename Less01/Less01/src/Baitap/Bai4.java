package Baitap;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập a:");
//        int a = sc.nextInt();
//        System.out.println("Nhập b:");
//        int b = sc.nextInt();
//        System.out.println("Nhập c:");
//        int c= sc.nextInt();
//
//        if (a==0) {
//            System.out.println("x = -b/c" +(-b/c));
//        }
//        if (a!= 0) {
//            System.out.println("delta = b^2 - 4ac" +( b*b - 4*a*c));
//            float e=  b*b - 4*a*c;
//        }else if (e >0) {
//
//        }

        float a;
        float b;
        float c;
        System.out.println("Nhap a,b,c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a == 0) {
            if (c == 0) {
                System.out.println("x = 0");
            }else {
                System.out.printf("x = %.2f" , -b/c);
            }
        }else {
            float del = b*b - 4*a*c;
            if (del < 0) System.out.println("PT vo nghiem");
            else if (del == 0) System.out.printf("x = %.2f", -b/(2*a));
            else {
                System.out.println("PT có 2 nghiệm:");
                System.out.printf("x1 =  %.2f",(-b + Math.sqrt(del)/(2*a)));
                System.out.printf("\nx2 =  %.2f",(-b - Math.sqrt(del)/(2*a)));
            }
        }
    }
}
