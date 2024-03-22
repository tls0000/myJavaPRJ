public class practice_03{
    public static void main(String[] args) {
        for  (int i = 1; i <= 4; i++) {
            String stars = "";
            for (int j = i; j < 4; j++) {
                stars += " ";
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        for (int i = 4; i >= 1; i--) {
            String stars = "";

            for (int j = 1; j <= 4 - i; j++) {
                stars += " ";
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }
        }

}
