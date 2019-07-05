import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pcCount = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double sells = 0;
        for (int i = 1; i <= pcCount; i++) {
            int a = Integer.parseInt(scanner.nextLine());

            int b = a % 10;
            sum += b;
            int x = Math.abs(a / 10) ;
            if (b == 2) {
                sells += 0;
            }
            else if (b == 3) {
                sells += x * 0.50;
            }
            else if (b == 4) {
                sells += x * 0.70;
            }
            else if (b == 5) {
                sells += x * 0.85;
            }
            else if (b == 6) {
                sells += x;
            }
        }
        System.out.printf("%.2f%n",sells);
        System.out.printf("%.2f",sum / pcCount);

    }
}
