package dev.nj.solutions;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupAnagramTests {

    @Test
    public void testSingleStringAnagram() {
        String[] strs = {"a"};

        List<List<String>> expected = List.of(List.of("a"));

        assertThat(GroupAnagram.method(strs)).isEqualTo(expected);
    }

    @Test
    public void testMultipleAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> expected = List.of(
                List.of("bat"),
                List.of("nat", "tan"),
                List.of("ate", "eat", "tea")
        );

        List<List<String>> output = GroupAnagram.method(strs);
        assertThat(compareLists(output, expected)).isTrue();
    }

    private boolean compareLists(List<List<String>> list1, List<List<String>> list2) {
        List<List<String>> sortedList1 = list1.stream()
                .map(innerList -> innerList.stream().sorted().collect(Collectors.toList()))
                .sorted(Comparator.comparing(Object::toString))
                .toList();

        List<List<String>> sortedList2 = list2.stream()
                .map(innerList -> innerList.stream().sorted().collect(Collectors.toList()))
                .sorted(Comparator.comparing(Object::toString))
                .toList();

        return sortedList1.equals(sortedList2);
    }

}

