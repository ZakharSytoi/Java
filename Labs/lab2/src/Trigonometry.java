import java.util.Scanner;
import java.lang.Math;
public class Trigonometry {
    static void calculate(){
        double x1, x2;
        System.out.println("Enter x1");
        Scanner myScan = new Scanner(System.in);
        x1 = myScan.nextDouble();

        System.out.println("Enter x2");
        x2 = myScan.nextDouble();

        System.out.println("sin(x1 + x2) = " + (Math.sin(x1)*Math.cos(x2) + Math.cos(x1)*Math.sin(x2)));
        System.out.println("cos(x1 + x2) = " + (Math.cos(x1)*Math.cos(x2) + Math.sin(x1)*Math.sin(x2)));
    }
}
