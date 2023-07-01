package org.example;

import java.util.*;

class RandomizedSet {
    Set<Integer> randSet;

    public RandomizedSet() {
        randSet = new HashSet<Integer>();
    }

    public boolean insert(int val) {
        return randSet.add(val);
    }

    public boolean remove(int val) {
        return randSet.remove(val);
    }

    public int getRandom() {
        return new ArrayList<>(randSet).get(new Random().nextInt(randSet.size()));
    }
}