public class practice_01 {
    public static void main(String[] args) {
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 5; b++) {
                if (a >= b) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }

            }
            System.out.println("");
        }
        for (int c = 5; c < 0; c++) {
            for (int d = 5; d > 0; d--) {
                if (c >= d) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }

            }
                System.out.println("");
            }
        }
    }





