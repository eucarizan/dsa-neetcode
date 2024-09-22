package dev.nj.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EncodeDecodeTests {

    @Test
    public void testBasic() {
        int a = 0;
        int b = 1;

        int expected = 1;

        assertThat(EncodeDecode.method(a, b)).isEqualTo(expected);
    }

}

