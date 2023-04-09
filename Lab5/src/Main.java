import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Main {

    static void printArr(ArrayList<Triple<Integer, String, Double>> arr){
        for (Triple<Integer, String, Double> i:
             arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Triple<Integer, String, Double > obj1 = new Triple<>(100, "AAAA", 5.3);
        Triple<Integer, String, Double > obj2 = new Triple<>(100, "BBBB", 5.3);
        Triple<Integer, String, Double > obj3 = new Triple<>(50, "AAAA", 5.3);
        Triple<Integer, String, Double > obj4 = new Triple<>(100, "AAAA", 6.8);
        Triple<Integer, String, Double > obj5 = new Triple<>(200, "AAAA", 6.8);
        Triple<Integer, String, Double > obj6 = new Triple<>(200, "AAAA", 6.8);

        System.out.println();
        System.out.println("Object 4:" + obj4);
        System.out.println("Object 5:" + obj5);
        System.out.println("Object 6:" + obj6);
        System.out.println();

        if (obj4.equals(obj5)) {
            System.out.println("Object4 == Object5");
        }
        else System.out.println("Object4 != Object5");

        if (obj5.equals(obj6)) {
            System.out.println("Object5 == Object6");
        }
        else System.out.println("Object5 != Object6");

        System.out.println();
        System.out.println();

        ArrayList<Triple<Integer, String, Double>> arr = new ArrayList<>();
        arr.add(obj1);
        arr.add(obj2);
        arr.add(obj3);
        arr.add(obj4);
        arr.add(obj5);
        System.out.println("Before Sort:");
        printArr(arr);
        System.out.println();
        System.out.println("After Sort:");
        Collections.sort(arr);
        printArr(arr);


        ArrayList<Triple<Integer, String, Double>> arr2 = new ArrayList<>();
        arr2.add(obj1);
        arr2.add(obj2);
        arr2.add(obj3);
        arr2.add(obj4);
        arr2.add(obj5);
        System.out.println();
        System.out.println();
        System.out.println("Before Sort:");
        printArr(arr2);
        System.out.println();
        System.out.println("After Sort:");
        arr2.sort(obj1.new TripleComparator());
        printArr(arr2);
    }
}