package dev.nj.solutions;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }
    
    public static boolean isAnagramMap(String s, String t) {
        if (t.length() == 0 && s.length() > 1) {
            return false;
        }

        if (t.length() > s.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.merge(ch, 1, Integer::sum);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.merge(ch, -1, Integer::sum);
        }

        return map.values().stream()
            .noneMatch(value -> value < 0);
    }
}
