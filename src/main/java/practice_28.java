public class practice_28 {
    public static void main(String[] args) {
        int n = 0; // 초기 n 값
        String control = "wsdaw"; // control 문자열

        for (int i = 0; i < control.length(); i++) {
            char c = control.charAt(i);
            if (c == 'w') {
                n += 1;
            } else if (c == 's') {
                n -= 1;
            } else if (c == 'd') {
                n += 10;
            } else if (c == 'a') {
                n -= 10;
            }
        }

        System.out.println(n); // 최종 n 값 출력
    }
}

