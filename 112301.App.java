import java.util.Random;
import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        int x,y,z;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            if (x==1){
            z = (int) (Math.random() * 100);
            y = (int) (Math.random() * 100);
            System.out.println(z + "," + y);
        }else {
            System.out.println("输入的不是1");
            }
    }
    }
}
