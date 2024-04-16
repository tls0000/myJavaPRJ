import java.util.Scanner;
public class Quiz01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;

        int a = s.nextInt();
        int b = s.nextInt();


        if (a<b){
            for (int i = a; i<=b; i++) {

                if (i % 2 != 0) {
                    hap += i;
                }
            }
        } else if (a>b){
            for (int i = a; i>=b; i--) {
                if (i % 2 != 0) {
                    hap += i;
                }
            }
        }
        System.out.println(a+"부터" + b + "까지의 홀수 합:" + hap);
    }
}

