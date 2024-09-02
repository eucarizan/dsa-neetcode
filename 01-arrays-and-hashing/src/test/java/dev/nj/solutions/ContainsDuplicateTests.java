package dev.nj.solutions;

import org.junit.jupiter.api.Test;

import java.io.IOException;

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
        int[] arr = {};

        assertThat(ContainsDuplicate.containsDuplicate(arr)).isFalse();
    }

    @Test
    public void testSingleElement() {
        int[] arr = {1};

        assertThat(ContainsDuplicate.containsDuplicate(arr)).isFalse();
    }

    @Test
    public void testLargeFileNoDuplicates() throws IOException {
        String fileName = "src/test/resources/tle.txt";

        assertThat(ContainsDuplicate.containsDuplicateFile(fileName)).isFalse();
    }

    @Test
    public void testLargeFileWithDuplicate() throws IOException {
        String fileName = "src/test/resources/tled.txt";

        assertThat(ContainsDuplicate.containsDuplicateFile(fileName)).isTrue();
    }
}
