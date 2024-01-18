package baitap;

import java.util.Random;

public class Bai2 {
    public static void main(String[] args) {

        int[] a = new int[10];

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            a[i] = random.nextInt(100);
        }


        System.out.println("Xuat mang");
        for (int i =0; i <10; i++) {
            System.out.printf("%d\n", a[i]);
        }
    }
}

