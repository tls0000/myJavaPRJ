import java.util.Scanner;

public class practice_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("number를 입력: ");
        int number = scanner.nextInt();

        System.out.print("a을 입력: ");
        int a = scanner.nextInt();

        System.out.print("b을 입력: ");
        int b = scanner.nextInt();

        if (number % a == 0 && number % b == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}
