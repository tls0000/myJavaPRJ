import java.util.Scanner;
public class practice_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("자연수 n입력 (1 ≤ n ≤ 1,000): ");
        int n = scanner.nextInt();
        checkEvenOdd(n);
    }
    public static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}
