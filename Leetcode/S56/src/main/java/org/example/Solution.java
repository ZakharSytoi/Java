package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int[][] merge(int[][] intervals) {
        boolean flag = true;
        int start, end;
        while (flag) {
            for (int i = 0; i < intervals.length; i++) {
                flag = false;
                if (intervals[i] != null) {
                    start = intervals[i][0];
                    end = intervals[i][1];
                    for (int j = 0; j < intervals.length; j++) {
                        if (j != i && intervals[j] != null
                                && (intervals[j][0] <= start && intervals[j][1] >= start
                                || intervals[j][0] >= start && intervals[j][1] <= end
                                || intervals[j][0] <= end && intervals[j][1] >= end)) {
                            end = Math.max(intervals[j][1], end);
                            start = Math.min(intervals[j][0], start);
                            intervals[j] = null;
                        }
                    }
                    if (start != intervals[i][0] || end != intervals[i][1]) {
                        flag = true;
                        intervals[i][0] = start;
                        intervals[i][1] = end;
                    }
                }
            }
        }
        return Arrays.stream(intervals).filter(Objects::nonNull).toArray(int[][]::new);
    }
}
/*
    List<int[]> result = new LinkedList<>();
    int start;
    int end;
        for (int i = 0; i < intervals.length; i++) {
        if (intervals[i] != null) {
        start = intervals[i][0];
        end = intervals[i][1];
        intervals[i] = null;
        for (int j = 0; j < intervals.length; j++) {
        if (intervals[j] != null
        && (intervals[j][0] <= start && intervals[j][1] >= start
        || intervals[j][0] >= start && intervals[j][1] >= end
        || intervals[j][0] <= end && intervals[j][1] >= end)) {
        end = Math.max(intervals[j][1], end);
        start = Math.min(intervals[j][0], start);
        intervals[j] = null;
        }
        }
        result.add(new int[]{start, end});
        }
        }
        return result.toArray(new int[result.size()][]);*/
