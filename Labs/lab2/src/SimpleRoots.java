import java.util.Scanner;

public class SimpleRoots {
    static void calculate(){
        double a, b, c;
        System.out.println("Enter a");
        Scanner myScan = new Scanner(System.in);
        a = myScan.nextDouble();

        System.out.println("Enter b");
        b = myScan.nextDouble();

        System.out.println("Enter c");
        c = myScan.nextDouble();

        System.out.println("root1 = " + (-b + Math.sqrt ( b * b - 4 * a * c ))/2 / a );
        System.out.println("root1 = " + (-b - Math.sqrt ( b * b - 4 * a * c ))/2 / a );

    }
}
