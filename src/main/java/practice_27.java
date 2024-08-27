public class practice_27 {
    public static void main(String[] args) {
        // 초기 n 값과 control 문자열을 설정합니다.
        int n = 0;
        String control = "wsdawsdassw";
        //"w": n을 1 증가시킵니다.
        //"s": n을 1 감소시킵니다.
        //"d": n을 10 증가시킵니다.
        //"a": n을 10 감소시킵니다.

        // control 문자열의 각 문자를 순회합니다.
        for (int i = 0; i < control.length(); i++) {
            char c = control.charAt(i);  // 현재 문자를 가져옵니다.

            // 각 문자에 따라 n 값을 변경합니다.
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

        // 최종적으로 변경된 n 값을 출력합니다.
        System.out.println("최종 n 값: " + n);
    }
}
