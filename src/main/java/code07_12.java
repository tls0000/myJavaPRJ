 class Rabbit {
        private String shape;
        private int xPos;
        private int yPos;

        void setPosition(int x, int y) {
            this.xPos = x;
            this.yPos = y;

            System.out.println("xPos : " + this.xPos + " / yPos : " + this.yPos);
        }
    }
 public class code07_12 {
     public static void main(String[] args) {

         Rabbit4 r = new rabbit4();

         r.xPos = 100; // 에러
         r.setPositioin(xPos : 100, yPos : 200 );
     }
