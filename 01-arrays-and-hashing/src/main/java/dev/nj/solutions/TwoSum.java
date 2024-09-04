package dev.nj.solutions;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
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

