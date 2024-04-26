import java.util.Scanner;
public class practice_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요:");
        String str = scanner.next();

        System.out.println("반복할 횟수를 입력하세요:");
        int n = scanner.nextInt();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
        }

        System.out.println(result.toString());

        scanner.close();
    }
}