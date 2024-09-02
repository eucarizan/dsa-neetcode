package dev.nj.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static boolean containsDuplicateBF(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (num == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean containsDuplicateFile(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            if (line != null) {
                return processLargeLine(line);
            }
            return false;
        }
    }

    private static boolean processLargeLine(String line) {
        Set<Integer> set = new HashSet<>();
        try (StringReader stringReader = new StringReader(line)) {
            StringBuilder numberBuilder = new StringBuilder();
            int ch;
            while ((ch = stringReader.read()) != -1) {
                char c = (char) ch;
                if (c == ',') {
                    int num = processNumber(numberBuilder.toString());
                    numberBuilder.setLength(0);
                    if (set.contains(num)) {
                        return true;
                    }
                    set.add(num);
                } else if (c != ' ') {
                    numberBuilder.append(c);
                }
            }
            if (!numberBuilder.isEmpty()) {
                int num = processNumber(numberBuilder.toString());
                return set.contains(num);
            }
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static int processNumber(String number) {
        try {
            return Integer.parseInt(number.trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + number);
            return 0;
        }
    }
}
