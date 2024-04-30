import java.util.Scanner;
public class practice_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 문자열을 입력하세요:");
        String str1 = scanner.nextLine();
        System.out.println("두 번째 문자열을 입력하세요:");
        String str2 = scanner.nextLine();
        scanner.close();

        String result = combineStrings(str1, str2);
        System.out.println("결과: " + result);
    }

    public static String combineStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            result.append(str1.charAt(i)).append(str2.charAt(i));
        }
        // 길이가 다른 나머지 부분을 추가
        if (str1.length() > minLength) {
            result.append(str1.substring(minLength));
        } else if (str2.length() > minLength) {
            result.append(str2.substring(minLength));
        }
        return result.toString();
    }
}
