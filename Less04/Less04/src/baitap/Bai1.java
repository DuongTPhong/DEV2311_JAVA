package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
//        int[] a = new int[10];
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap mang:");
//        for (int i=0; i<10; i ++) {
//            a[i] = Integer.parseInt(scanner.nextLine());
//        }
//
//        System.out.println("Xuat mang");
//        for (int i =0; i <10; i++) {
//            System.out.printf("%d", a[i]);
//        }

        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i =0; i<10; i++) {
            System.out.println("Nhap phan tu thu " +i);
            int a = Integer.parseInt(scanner.nextLine());
            list.add(a);
        }
        System.out.println("Mang vua nhap:");
        for (int i=0; i < list.size(); i++) {
            System.out.printf("Phan tu thu %d: %d\n", i, list.get(i));
        }
    }
}
