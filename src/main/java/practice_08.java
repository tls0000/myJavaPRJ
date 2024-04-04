import java.util.Scanner;//:Scanner 클래스 불러오기

public class practice_08 {   //:클래스 이름
    public static void main(String[] args) {  //:메인 메소드 실행
        Scanner s = new Scanner(System.in);  //: Scanner 객체 설정
        int num; //:변수 설정

        System.out.println("숫자 입력 ==>");  //:"숫자 입력" 출력
        num = s.nextInt();  //:정수값 입력

        if (num%21 == 0) //:num을 3과 7의 최소공배수인 21을 나눠서 0이 나오면 실행
            System.out.println("3의 배수,7의 배수 모두 만족합니다"); //:"3의 배수,7의 배수 모두 만족합니다" 출력
        else if (num%3 == 0)  //:윗줄의 if문이 틀리고 num을 3으로 나눠서 0이 나오면 실행
            System.out.println("3의 배수입니다"); //:"3의 배수입니다" 출력
        else if (num%7 ==0)  //:윗줄의 if문과 else if문 틀리고 num을 7로 나눠서 0이 나오면 실행
        System.out.println("7의 배수입니다");  //:"7의 배수입니다" 출력
        else //:윗줄의 if문들이 틀릴시 실행
            System.out.println("3과 7,모두의 배수가 아닙니다.");  //:"3과 7,모두의 배수가 아닙니다."출력

        s.close();
    }
}