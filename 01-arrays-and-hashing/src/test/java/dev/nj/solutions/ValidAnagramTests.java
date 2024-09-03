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

    @Test
    public void testTEmpty() {
        String s = "empty";
        String t = "";

        assertThat(ValidAnagram.isAnagram(s, t)).isFalse();
    }

    @Test
    public void testSingleCharNotAnagram() {
        String s = "a";
        String t = "b";

        assertThat(ValidAnagram.isAnagram(s, t)).isFalse();
    }

    @Test
    public void test2ndWordLonger() {
        String s = "a";
        String t = "ab";

        assertThat(ValidAnagram.isAnagram(s, t)).isFalse();
    }

}
