public class code04_13 {
    public static void main(String[] args) {
        String str ="   한글 ABCD efgh ";
        String upper ="";
        String lower = "";
        String cutStr = "";

        upper = str.toUpperCase();
        lower = str.toUpperCase();
        cutStr = str.trim();

        cutStr = str.trim();


        System.out.println("기존 문자열 ==>[" + str + "]");
        System.out.println("공백 제거 ==> [" + cutStr + "]");
        System.out.println("대문자 ==>[" + upper + "]");
        System.out.println("소문자 ==>[" + lower + "]");
    }
}
