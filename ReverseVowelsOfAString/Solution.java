package ReverseVowelsOfAString;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public String reverseVowels(String s) {
    HashSet<Character> set = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    char[] charArray = s.toCharArray();
    StringBuilder sb = new StringBuilder(s);

    int left = 0;
    int right = charArray.length - 1;

    while (left < right) {
      if (set.contains(charArray[left]) && set.contains(charArray[right])) {
        char temp = charArray[left];
        sb.setCharAt(left, charArray[right]);
        sb.setCharAt(right, temp);
        left++;
        right--;
      } else if (!set.contains(charArray[right])) {
        right--;
      } else if (!set.contains(charArray[left])) {
        left++;
      }
    }

    return sb.toString();
  }
}
