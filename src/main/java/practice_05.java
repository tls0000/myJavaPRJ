import java.util.Scanner;
public class practice_05{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.println("년도를 입력하세요. :");
        a = s.nextInt();

        if ((a%4 == 0 && a%100 !=0) || (a % 400 == 0))
            System.out.printf("%d 년은 윤년입니다.\n", a);
        else
            System.out.printf("%d 년은 윤년이 아닙니다.\n", a);
        s.close();
    }
}

