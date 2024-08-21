public class practice_23 {
        public static void main(String[] args) {
            int start = 300000;  // 첫 달에 저축하는 금액 (예시값)
            int before = 100000; // 70만 원까지 매월 저축하는 금액 (예시값)
            int after = 200000;  // 70만 원 이후 매월 저축하는 금액 (예시값)

            int totalSavings = start;
            int months = 1;

            // 70만 원이 될 때까지 매월 before 만큼 저축
            while (totalSavings < 700000) {
                totalSavings += before;
                months++;
            }

            // 100만 원이 될 때까지 매월 after 만큼 저축
            while (totalSavings < 1000000) {
                totalSavings += after;
                months++;
            }

            System.out.println("100만 원을 모으기까지 걸린 개월 수: " + months);
        }
    }