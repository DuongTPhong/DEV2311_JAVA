package Baitap;
import java.util.Scanner;
public class Bai10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập giá trị cho biến ký tự color: ");
            char color = scanner.next().toUpperCase().charAt(0);

            switch (color) {
                case 'R':
                    System.out.println("RED");
                    break;
                case 'G':
                    System.out.println("GREEN");
                    break;
                case 'B':
                    System.out.println("BLUE");
                    break;
                default:
                    System.out.println("BLACK");
            }
        }
}
