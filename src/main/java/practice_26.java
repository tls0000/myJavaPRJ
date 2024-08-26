public class practice_26 {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 8; 

        int sum1 = 0;
        if (n1 % 2 == 1) {
            for (int i = 1; i <= n1; i += 2) {
                sum1 += i;
            }
        } else { // n1이 짝수일 경우
            for (int i = 2; i <= n1; i += 2) {
                sum1 += i * i;
            }
        }
        System.out.println(sum1); // 16 출력

        // 두 번째 예시
        int sum2 = 0;
        if (n2 % 2 == 1) { // n2가 홀수일 경우
            for (int i = 1; i <= n2; i += 2) {
                sum2 += i;
            }
        } else { // n2가 짝수일 경우
            for (int i = 2; i <= n2; i += 2) {
                sum2 += i * i;
            }
        }
        System.out.println(sum2); // 120 출력
    }
}

