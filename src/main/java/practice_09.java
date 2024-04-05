import java.util.Scanner;
public class practice_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("수식을 입력하세요: ");
        int a = s.nextInt();
        char A = s.next().charAt(0); // 연산자를 문자로 입력받음
        int b = s.nextInt();

        switch (A) {
            case '+':
                System.out.printf("%d + %d = %d 입니다.\n", a, b, a + b);
                break;
            case '-':
                System.out.printf("%d - %d = %d 입니다.\n", a, b, a - b);
                break;
            case '*':
                System.out.printf("%d * %d = %d 입니다.\n", a, b, a * b);
                break;
            case '/':
                if (b != 0)
                    System.out.printf("%d / %d = %d 입니다.\n", a, b, a / b);
                else
                    System.out.println("0 말고 다른 숫자로 해보세요.");
                break;
            case '%':
                if (b != 0)
                    System.out.printf("%d %% %d = %d 입니다.\n", a, b, a % b);
                else
                    System.out.println("0 말고 다른 숫자로 해보세요.");
                break;
            default:
                System.out.println("연산자를 잘못 입력했습니다.");
                break;
        }
    }
}
