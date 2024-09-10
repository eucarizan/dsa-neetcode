package dev.nj.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TopKFrequentTests {

    @Test
    public void testBasic() {
        int[] a = {0};
        int b = 1;

        int[] expected = {1};

        assertThat(TopKFrequent.topKFrequent(a, b)).isEqualTo(expected);
    }

}

