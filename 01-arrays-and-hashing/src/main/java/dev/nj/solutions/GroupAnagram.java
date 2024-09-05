package dev.nj.solutions;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            /*
            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                sum += ch - 'a' - 1;
            }
            */
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(str);
        }

        return new ArrayList<>(map.values());
    }

}

