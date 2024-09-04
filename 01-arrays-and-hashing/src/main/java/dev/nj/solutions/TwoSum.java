package dev.nj.solutions;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            
            map.put(num, i);
        }

        return new int[] {};
    }

    public static int[] twoSumBF(int[] nums, int target) {
        int[] result = {0, 1};

        for (int i = 0; i < nums.length - 1; i++) {
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (target == num + nums[j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }
}

