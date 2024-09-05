package dev.nj.solutions;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagram {
    public static List<List<String>> method(String[] strs) {
        HashMap<Integer, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                sum += ch - 'a';
            }
            if (map.containsKey(sum)) {
                map.get(sum).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sum, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}

