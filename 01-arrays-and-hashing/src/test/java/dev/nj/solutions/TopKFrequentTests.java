package dev.nj.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TopKFrequentTests {

    @Test
    public void testBasic() {
        int[] a = {1};
        int b = 1;

        int[] expected = {1};

        assertThat(TopKFrequent.topKFrequent(a, b)).isEqualTo(expected);
    }

    @Test
    public void testTwoFrequent() {
        int[] a = {1, 1, 1, 2, 2, 3};
        int b = 2;

        int[] expected = {1, 2};

        assertThat(TopKFrequent.topKFrequent(a, b)).isEqualTo(expected);
    }

    @Test
    public void testTwoEntries() {
        int[] a = {1, 2};
        int b = 2;

        int[] expected = {1, 2};

        assertThat(TopKFrequent.topKFrequent(a, b)).isEqualTo(expected);
    }

}

