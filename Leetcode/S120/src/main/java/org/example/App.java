package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Solution s = new Solution();
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(-1));
        list.add(List.of(2,3));
        list.add(List.of(1,-1,-3));
        //list.add(List.of(4,1,8,3));
        s.minimumTotal(list);
    }
}
