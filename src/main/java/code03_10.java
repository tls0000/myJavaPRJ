import java.util.Scanner;
public class code03_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score;

        System.out.println("필기시럼 점수를 입력하세요:");
        score = s.nextInt();
        System.out.println(score >= 70);

        s.close();
    }
}
