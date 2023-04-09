import java.util.Scanner;
import java.lang.Math;
public class Investition {
    static void calculate(){
        double initValue, percentage, monthNumber;
        System.out.println("Enter initial value");
        Scanner myScan = new Scanner(System.in);
        initValue = myScan.nextDouble();

        System.out.println("Enter percentage");
        percentage = myScan.nextDouble();

        System.out.println("Enter number of month");
        monthNumber = myScan.nextDouble();

        System.out.println("Estimated value = " + initValue*Math.pow(1 + percentage, monthNumber) );

    }

}
