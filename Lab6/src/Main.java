import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        IntNumsGenerator.showSortedByValue(IntNumsGenerator.generator(10000, 10));
        System.out.println();
        
        IntNumsGenerator.showSortedByValue(IntNumsGenerator.generatorWithStreams(10000, 10));
        System.out.println();

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        MyLinkedList<Integer>.Iterator iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next().getValue());
        }

        System.out.println();

        System.out.println(list.contains(10));

        System.out.println();

        ArrayList<Job> jobs = new ArrayList<>();

        jobs.add(new Job("go to school", 1));
        jobs.add(new Job("go to the cinema", 4));
        jobs.add(new Job("go for a walk", 6));
        jobs.add(new Job("do homework", 8));
        jobs.add(new Job("cook breakfast", 3));
        jobs.add(new Job("cook dinner", 2));
        jobs.add(new Job("go to party", 100));
        jobs.add(new Job("wash the dishes", 3));
        jobs.add(new Job("deal with the mess in room", 0));
        jobs.add(new Job("be happy", 102));

        Collections.sort(jobs);

        jobs.forEach(System.out::println);
    }


}