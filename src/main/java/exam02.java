import java.util.Scanner;

public class exam02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("숫자 입력 ==>");
        num = s.nextInt();

        if (num%15 == 0)
            System.out.println("3의 배수,5의 배수 모두 만족합니다");
        else if (num%3 == 0)
            System.out.println("3의 배수입니다");
        else if (num%5 ==0)
            System.out.println("5의 배수입니다");


        s.close();
    }
}

