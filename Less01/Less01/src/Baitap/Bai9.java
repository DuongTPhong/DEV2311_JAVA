package Baitap;
import java.util.Scanner;
public class Bai9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập lựa chọn của bạn (B/K/G): ");
            char playerChoice = scanner.next().toUpperCase().charAt(0);

            char computerChoice = getRandomChoice();

            System.out.println("Lựa chọn của máy là: " + computerChoice);

            switch (playerChoice) {
                case 'B':
                    switch (computerChoice) {
                        case 'B':
                            System.out.println("Hòa!");
                            break;
                        case 'K':
                            System.out.println("Bạn thắng!");
                            break;
                        case 'G':
                            System.out.println("Bạn thua!");
                            break;
                    }
                    break;

                case 'K':
                    switch (computerChoice) {
                        case 'B':
                            System.out.println("Bạn thua!");
                            break;
                        case 'K':
                            System.out.println("Hòa!");
                            break;
                        case 'G':
                            System.out.println("Bạn thắng!");
                            break;
                    }
                    break;

                case 'G':
                    switch (computerChoice) {
                        case 'B':
                            System.out.println("Bạn thắng!");
                            break;
                        case 'K':
                            System.out.println("Bạn thua!");
                            break;
                        case 'G':
                            System.out.println("Hòa!");
                            break;
                    }
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn B, K hoặc G.");
            }
        }

        private static char getRandomChoice() {
            char[] choices = {'B', 'K', 'G'};
            int randomIndex = (int) (Math.random() * 3);
            return choices[randomIndex];
        }

}
