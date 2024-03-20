public class practice_01 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int a = 3; a > i; a--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}



