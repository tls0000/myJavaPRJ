class Rabbit {
    String shape;
    int xPos;
    int yPos;

    Rabbit() {
        this.shape = "토끼";
    }

    void setPosition(int xPos,int yPos) {
    this.xPos = xPos;
    this.yPos = yPos;
    }
}
public class code07_10 {
    public static void main(String[] args) {
        String rabbitColor = "파란색";

        Rabbit rabbit = new Rabbit();

        System.out.println("토끼 객체의 기본 모양은 [%s]입니다.", rabbit.shape);
    }
}

