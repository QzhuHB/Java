
public class MathTest {
    public static void main(String[] args) throws InterruptedException {
        int x,y;
        while (true) {
            Thread.sleep(1000);
            x = (int) (Math.random() * 100);
            y = (int) (Math.random() * 100);
            System.out.println(x + "," + y);
    }
    }
}
