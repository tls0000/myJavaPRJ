import java.util.Scanner;

public class practice_11 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a,b;

    System.out.println("첫 번째(a) ==> ");
    a = s.nextInt();

    System.out.println("두 번쨰(b) ==> ");
    b = s.nextInt();

    if (a > b) {
        System.out.println("a는 b보다 큽니다.");
    }else if (a == b) {
        System.out.println("a는 b와 같습니다.");
    }else if (a < b){
        System.out.println("a는 b보다 작습니다.");

    }
    s.close();
}
}
