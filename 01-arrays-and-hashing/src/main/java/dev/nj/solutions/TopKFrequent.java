package dev.nj.solutions;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.merge(num, 1, (oldValue, newValue) -> oldValue + 1);
        }

        return map.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
