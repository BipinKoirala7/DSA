package Anagram;

import java.util.HashMap;

/**
 * Title: Valid Anagram
 * Link: https://leetcode.com/problems/valid-anagram/
 * Problem: Given two strings s and t, return true if t is an anagram of s, and
 * false otherwise.
 * 
 * Constraints:
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 * 
 * My Approach:
 * We can create character array from the given string and we can store a
 * numerical
 * value of each character and store in hashmap. At last, we should see if both
 * hashmap are equal or not.
 * 
 * Complexity Analysis: (Best version: 1.0)
 * Time Complexity: 24ms, O(N)
 * Space Complexity: 45.81MB, O(1)
 * 
 * @author Bipinkoirala
 * @version 1.0
 */
public class Anagram {

    /**
     * Return if given two string are anagram of each other or not
     * 
     * @param s first string
     * @param t second string
     * @return if anagram or not
     */
    public boolean isAnagram(String s, String t) {
        // If length of two string are different, it cannot be anagram
        if (s.length() != t.length()) {
            return false;
        }

        // Create character array of both strings
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();

        // Hashmap for character and their occurrence count
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();

        // loop to store the string character in hashmap with occurrence count
        for (char c : char1) {
            if (hashMap1.containsKey(String.valueOf(c))) {
                int prev = hashMap1.get(String.valueOf(c));
                prev++;
                hashMap1.put(String.valueOf(c), prev);
            } else {
                hashMap1.put(String.valueOf(c), 1);
            }
        }

        // loop to store the string character in hashmap with occurrence count
        for (char c : char2) {
            if (hashMap2.containsKey(String.valueOf(c))) {
                int prev = hashMap2.get(String.valueOf(c));
                prev++;
                hashMap2.put(String.valueOf(c), prev);
            } else {
                hashMap2.put(String.valueOf(c), 1);
            }
        }

        // return if both hashmap is equal
        return hashMap1.equals(hashMap2);
    }

    /**
     * Return if given two string are anagram of each other or not
     * 
     * @param s first string
     * @param t second string
     * @return if anagram or not
     * @version 1.1
     */
    public boolean isAnagram2(String s, String t) {
        // If length of two string are different, it cannot be anagram
        if (s.length() != t.length()) {
            return false;
        }

        // Create character array of both strings
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();

        // Hashmap for character and their occurrence count
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();

        // loop to store the string character in hashmap with occurrence count
        for (int i = 0; i < char1.length; i++) {
            if (hashMap1.containsKey(String.valueOf(char1[i]))) {
                int prev = hashMap1.get(String.valueOf(char1[i]));
                prev++;
                hashMap1.put(String.valueOf(char1[i]), prev);
            } else {
                hashMap1.put(String.valueOf(char1[i]), 1);
            }

            if (hashMap2.containsKey(String.valueOf(char2[i]))) {
                int prev = hashMap2.get(String.valueOf(char2[i]));
                prev++;
                hashMap2.put(String.valueOf(char2[i]), prev);
            } else {
                hashMap2.put(String.valueOf(char2[i]), 1);
            }
        }

        // return if both hashmap is equal
        return hashMap1.equals(hashMap2);
    }
}