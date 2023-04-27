import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntNumsGenerator {

    public static HashMap<Integer, Integer> generator(int n, int k) {
        Random rand = new Random();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int rnd = rand.nextInt(k);
            if (map.containsKey(rnd)) {
                map.put(rnd, map.get(rnd) + 1);
            } else map.put(rnd, 1);
        }
        return map;
    }

    public static Map<Integer, Long> generatorWithStreams(int n, int k) {
        Random rand = new Random();
        return Stream.generate(() -> rand.nextInt(k)).limit(n).collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
    }

    // V extends Comparable< ? super V> means that Values
    // may not implement Comparable by itself, but by super-class
    public static <K, V extends Comparable<? super V>> void showSortedByValue(Map<K, V> map) {
        System.out.println(map);
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort((Map.Entry.comparingByValue()));
        Collections.reverse(list);
        System.out.println(list);

    }
}
