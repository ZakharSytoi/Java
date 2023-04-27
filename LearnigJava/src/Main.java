import Leetcode.S15.Solution;
import basicExamples.CallbackTest;
import basicExamples.Generics1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> coll = new ArrayList<String>();
        coll.add("1111");
        coll.add("222");
        coll.add("1234");
        System.out.println(coll);
        Generics1.swapInCollection(coll,1,2);
        System.out.println(coll);

        Queue<Integer> a = new LinkedList<Integer>();
    }
}