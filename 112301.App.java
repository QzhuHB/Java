import java.util.Random;
import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        int x, y;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            y = (int) (Math.random() * 100);
            System.out.println(x + "," + y);
        }
    }
}
