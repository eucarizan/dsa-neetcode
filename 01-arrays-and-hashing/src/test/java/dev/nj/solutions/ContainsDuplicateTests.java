package dev.nj.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContainsDuplicateTests {
    
    @Test
    public void testNormalCase() {
        int[] arr = {1, 2, 3, 1};

        assertThat(ContainsDuplicate.containsDuplicate(arr)).isTrue();
    }

    @Test
    public void testNoDuplicate() {
        int[] arr = {1, 2, 3, 4};

        assertThat(ContainsDuplicate.containsDuplicate(arr)).isFalse();
    }

    @Test
    public void testNoElement() {
        int [] arr = {};

        assertThat(ContainsDuplicate.containsDuplicate(arr)).isFalse();
    }

    @Test
    public void testSingleElement() {
        int [] arr = {1};

        assertThat(ContainsDuplicate.containsDuplicate(arr)).isFalse();
    }
}
