public class practice_21 {
    public static void main(String[] args) {
        for (int i = 2, j = 1; i <= 9;) { // i는 2에서 9까지 사용,j를 1로 초기화
            System.out.print(i + " * " + j + " = " + (i * j) + "\n"); // i * j 결과를 출력
            if (j == 9) { // j가 9가 되면 현재 단 종료
                System.out.println(); // 줄 바꿈
                j = 1; // j를 1로 초기화
                i++; // i가 증가
            } else {
                j++; // j가 증가
            }
        }
    }
}