import java.util.Scanner;

public class practice_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        String age_type = sc.next();

        int age;

        if (age_type.equals("korea")) {
            age = 2030 - year + 1;
        } else if (age_type.equals("year")) {
            age = 2030 - year;
        } else {
            // 잘못된 age_type인 경우, 오류 메시지를 출력하고 프로그램을 종료합니다.
            System.out.println("Invalid age type");
            return;
        }

        System.out.println(age);
    }
}



