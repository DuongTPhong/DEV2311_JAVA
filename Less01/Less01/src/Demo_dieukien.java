import java.util.Scanner;

public class Demo_dieukien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = sc.nextInt();
        if (a==5) {
            System.out.println("a bang 5");
        } else if (a == 7) {
            System.out.println("a bang 7");
        } else {
            System.out.println("a khac 5 va 7");
        }

        switch (a) {
            case 5:
                System.out.println("a bang 5");
                break;
            case 7:
                System.out.println("a bang 7");
                break;
            case 10:
                System.out.println("a bang 10");
                break;
            default:
                System.out.println("a khac 5, 7, 10");
        }
    }
}
