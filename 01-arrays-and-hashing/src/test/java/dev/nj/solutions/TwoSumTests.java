package dev.nj.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoSumTests {

    @Test
   public void testMethod() {
        int[] nums = {1, 2, 3};
        int target = 4;

        int[] expected = {0, 2};

        assertThat(TwoSum.twoSum(nums, target)).isEqualTo(expected);
    }
}

