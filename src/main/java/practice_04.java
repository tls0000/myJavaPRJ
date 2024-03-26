public class practice_04 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 2 * 4 - 1; j++) {
                if (j >= a & j <= b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            a--;
            b++;
        }
    }
}

