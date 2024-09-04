package dev.nj.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoSumTests {

    @Test
    public void testBasic() {
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
    public void testRepeatedElements() {
        int[] nums = {3, 3};
        int target = 6;

        int[] expected = {0, 1};

        assertThat(TwoSum.twoSum(nums, target)).isEqualTo(expected);
    }

    @Test
    public void testNegative() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;

        int[] expected = {0, 2};
        
        assertThat(TwoSum.twoSum(nums, target)).isEqualTo(expected);
    }

    @Test
    public void testLargeNumbers() {
        int[] nums = {1000000, 500, 1000, 999500};
        int target = 1000000;

        int[] expected = {1, 3};
        
        assertThat(TwoSum.twoSum(nums, target)).isEqualTo(expected);
    }

    @Test
    public void testSinglePairBothEnds() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20};
        int target = 21;

        int[] expected = {0, 9};
        
        assertThat(TwoSum.twoSum(nums, target)).isEqualTo(expected);
    }

    @Test
    public void testAllNegative() {
        int[] nums = {-7, -2, -9, -5, -8};
        int target = -7;

        int[] expected = {1, 3};
        
        assertThat(TwoSum.twoSum(nums, target)).isEqualTo(expected);
    }
}

