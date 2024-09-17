package dev.nj.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TopKFrequentTests {

    @Test
    public void testSingleElement() {
        int[] a = {1};
        int k = 1;

        int[] expected = {1};

        assertThat(TopKFrequent.topKFrequent(a, k)).isEqualTo(expected);
    }

    @Test
    public void testTwoFrequent() {
        int[] a = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] expected = {1, 2};

        assertThat(TopKFrequent.topKFrequent(a, k)).isEqualTo(expected);
    }

    @Test
    public void testTwoEntries() {
        int[] a = {1, 2};
        int k = 2;

        int[] expected = {1, 2};

        assertThat(TopKFrequent.topKFrequent(a, k)).isEqualTo(expected);
    }

    @Test
    public void testAllSame() {
        int[] a = {4, 4, 4, 4};
        int k = 2;

        int[] expected = {4, 0};

        assertThat(TopKFrequent.topKFrequent(a, k)).isEqualTo(expected);
    }

    @Test
    public void testEqualFrequencty() {
        int[] a = {1, 2, 3, 4};
        int k = 2;

        int[] expected = {1, 2};

        assertThat(TopKFrequent.topKFrequent(a, k)).isEqualTo(expected);
    }

    @Test
    public void testEmptyArray() {
        int[] a = {};
        int k = 0;

        int[] expected = {};

        assertThat(TopKFrequent.topKFrequent(a, k)).isEqualTo(expected);
    }

    @Test
    public void testUniqueEqualsElements() {
        int[] a = {5, 6, 7, 8};
        int k = 4;

        int[] expected = {5, 6, 7, 8};

        assertThat(TopKFrequent.topKFrequent(a, k)).isEqualTo(expected);
    }
}

