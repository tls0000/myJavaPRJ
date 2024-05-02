import java.util.Scanner;
public class practice_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 a를 입력하세요: ");
        int a = scanner.nextInt();

        System.out.print("정수 b를 입력하세요: ");
        int b = scanner.nextInt();

        int result = solution(a, b);
        System.out.println("결과: " + result);
    }

    public static int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        if (Integer.parseInt(ab) > Integer.parseInt(ba)) {
            return Integer.parseInt(ab);
        } else {
            return Integer.parseInt(ba);
        }
    }
}
