import java.util.Scanner;

public class PrintSample {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int userNumber = scanner.nextInt();
            System.out.println(userNumber);
        } else {
            System.out.println("Введено не число");
        }

    }
}
