import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[12];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mang:");
        for (int i=0; i<5; i ++) {
            a[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Xuat mang");
        for (int i =0; i <5; i++) {
            System.out.printf("%d", a[i]);
        }
        int[] b = {1,2,4,2,4,};

        System.out.println("mang b:");
        for (int i =0; i <5; i++) {
            System.out.printf("%d", b[i]);
        }
    }
}