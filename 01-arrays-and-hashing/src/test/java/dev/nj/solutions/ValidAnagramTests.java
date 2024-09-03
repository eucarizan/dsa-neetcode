package dev.nj.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat; 

public class ValidAnagramTests {

    @Test
    public void testIsAnagram() {
        String s = "anagram";
        String t = "nagaram";

        assertThat(ValidAnagram.isAnagram(s, t)).isTrue();
    }

    @Test
    public void testIsNotAnagram() {
        String s = "rat";
        String t = "car";

        assertThat(ValidAnagram.isAnagram(s, t)).isFalse();
    }

}
