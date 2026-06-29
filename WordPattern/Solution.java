package WordPattern;

import java.util.Arrays;
import java.util.HashMap;

// Add a new solution
/**
 * Checks whether a pattern matches a space-separated sequence of words.
 */
public class Solution {
  public boolean wordPattern(String pattern, String s) {
    // Null input is treated as an immediate success in this implementation.
    if (pattern == null || s == null)
      return true;

    String[] strings = s.split(" ");
    System.out.println(Arrays.toString(strings));

    // Pattern length and word count must match before mapping can work.
    if (pattern.length() != strings.length)
      return false;

    HashMap<String, String> hashMap = new HashMap<>();
    char[] patternCharArray = pattern.toCharArray();

    for (int i = 0; i < patternCharArray.length; i++) {
      // Enforce a one-to-one mapping between pattern letters and words.
      System.out.println("------------------------------------------");

      String patternLetter = String.valueOf(patternCharArray[i]);

      System.out.println("Pattern Word: " + patternLetter);
      System.out.println("Value in hashMap: " + hashMap.get(patternLetter));

      if (hashMap.containsKey(patternLetter)) {
        System.out.println("Pattern word already exists in hashMap");
        System.out.println("String: " + strings[i]);
        if (!hashMap.get(patternLetter).equals(strings[i])) {
          return false;
        }
      } else {
        if (hashMap.containsValue(strings[i])) {
          return false;
        }
        hashMap.put(patternLetter, strings[i]);
      }
    }

    return true;
  }
}
