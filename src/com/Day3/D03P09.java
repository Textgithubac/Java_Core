package com.Day3;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.HashSet;

public class D03P09 {
	

	    public static boolean canChain(String[] arr) {
	        if (arr.length <= 1) {
	            return false; // Invalid input
	        }

	        // Create a map to store outgoing edges from each character
	        HashMap<Character, ArrayList<String>> graph = new HashMap<>();
	        for (String word : arr) {
	            char lastChar = word.charAt(word.length() - 1);
	            if (!graph.containsKey(lastChar)) {
	                graph.put(lastChar, new ArrayList<>());
	            }
	            graph.get(lastChar).add(word);
	        }

	        // Perform DFS to check for cycles and unvisited nodes
	        HashSet<String> visited = new HashSet<>();
	        for (String word : arr) {
	            char firstChar = word.charAt(0);
	            if (visited.contains(word)) {
	                continue; // Skip already visited words
	            }
	            if (!dfs(graph, visited, word, firstChar)) {
	                return false;
	            }
	        }

	        return true;
	    }

	    private static boolean dfs(HashMap<Character, ArrayList<String>> graph, HashSet<String> visited, String word, char firstChar) {
	        visited.add(word);
	        for (String nextWord : graph.getOrDefault(word.charAt(word.length() - 1), new ArrayList<>())) {
	            if (nextWord.equals(word)) {
	                // Cycle detected
	                return false;
	            }
	            if (!visited.contains(nextWord)) {
	                if (!dfs(graph, visited, nextWord, nextWord.charAt(0))) {
	                    return false;
	                }
	            }
	        }

	        // Check if all nodes are visited
	        return visited.size() == graph.size();
	    }

	    public static void main(String[] args) {
	        String[] arr1 = {"abc", "efg", "cde", "ghi", "ija"};
	        String[] arr2 = {"ijk", "kji", "abc", "cba"};

	        System.out.println(canChain(arr1) ? "Yes\n" + String.join(" ", arr1) : "No"); // Output: Yes, abc cde efg ghi ija
	        System.out.println(canChain(arr2) ? "Yes\n" + String.join(" ", arr2) : "No"); // Output: No
	    }

}
