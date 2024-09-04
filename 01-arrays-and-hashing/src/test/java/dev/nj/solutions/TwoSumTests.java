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

    @Test
    public void testSample1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] expected = {0, 1};

        assertThat(TwoSum.twoSum(nums, target)).isEqualTo(expected);
    }

    @Test
    public void testSample2() {
        int[] nums = {3, 3};
        int target = 6;

        int[] expected = {0, 1};

        assertThat(TwoSum.twoSum(nums, target)).isEqualTo(expected);
    }
}

