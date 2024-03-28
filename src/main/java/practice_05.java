import java.util.Scanner;
public class practice_05{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.println("년도를 입력하세요. :");
        a = s.nextInt();

        if ((a%4 == 0 && a%100 !=0) || (a % 400 == 0))
            System.out.println("해당 년도는 윤년입니다.");
        else
            System.out.println("해당 년도는 윤년이 아닙니다.");
        s.close();
    }
}
