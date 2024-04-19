import java.util.Scanner;
public class practice_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        String age_type = s.next();
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2024 - year + 1;
        }
        else if (age_type.equals("Year")) {
            answer = 2024 - year;
        }
        System.out.println(answer);
    }
}
