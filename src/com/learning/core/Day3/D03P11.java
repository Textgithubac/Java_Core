package com.learning.core.Day3;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class D03P11 {
	public static List<String> findMatchingStrings(String[] dictionary, String pattern) {
        List<String> matchingStrings = new ArrayList<>();

        for (String word : dictionary) {
            if (word.length() == pattern.length()) {
                if (matchesPattern(word, pattern)) {
                    matchingStrings.add(word);
                }
            }
        }

        return matchingStrings;
    }

    private static boolean matchesPattern(String word, String pattern) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> used = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            char p = pattern.charAt(i);

            if (!map.containsKey(c)) {
                if (used.contains(p)) {
                    return false;
                }
                map.put(c, p);
                used.add(p);
            } else {
                if (map.get(c) != p) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] dictionary = {"abb", "abc", "xyz", "xyy"};
        String pattern = "Foo";

        List<String> matchingStrings = findMatchingStrings(dictionary, pattern);

        // Output
        for (String str : matchingStrings) {
            System.out.print(str + " ");
        }
    }

}
