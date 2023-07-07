import java.util.Scanner;
import java.lang.Math;
public class Gravitation {
    public static void calculate(){
        double m1, m2, distance;
        System.out.println("Enter m1");
        Scanner myScan = new Scanner(System.in);
        m1 = myScan.nextDouble();

        System.out.println("Enter m2");
        m2 = myScan.nextDouble();

        System.out.println("Enter distance");
        distance = myScan.nextDouble();

        System.out.println("Gravitation action = " + 6.67 * Math.pow(10, -11) * m1 * m2 / distance/ distance );


    }

}
