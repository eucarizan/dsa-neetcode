package dev.nj.solutions;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (num == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
