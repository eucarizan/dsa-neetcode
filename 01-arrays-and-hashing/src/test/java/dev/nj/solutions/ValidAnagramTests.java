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

    @Test
    public void testSingleCharAnagram() {
        String s = "a";
        String t = "a";

        assertThat(ValidAnagram.isAnagram(s, t)).isTrue();
    }

    @Test
    public void testLargeInputAnagram() {
        String s = "abcdefghijklmnopqrstuvwxyz".repeat(1000);
        String t = "zyxwvutsrqponmlkjihgfedcba".repeat(1000);

        assertThat(ValidAnagram.isAnagram(s, t)).isTrue();
    }

    @Test
    public void testLargeInputNotAnagram() {
        String s = "abcdefghijklmnopqrstuvwxyz".repeat(1000);
        String t = "zyxwvutsrqponmlkjihgfedcbx".repeat(1000);

        assertThat(ValidAnagram.isAnagram(s, t)).isFalse();
    }

}
