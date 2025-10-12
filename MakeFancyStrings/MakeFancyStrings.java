package MakeFancyStrings;

/**
 * Title: Delete Characters to Make Fancy String
 * Link:
 * https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/
 * Problem: A fancy string is a string where no three consecutive characters are
 * equal.
 * 
 * Give a string s, delete the minimum possible number of characters from s to
 * make it
 * fancy.
 * Return the final string after the deletion. It can be shown that the answer
 * will always
 * be unique.
 * 
 * Example 1:
 * Input: s = "leeetcode"
 * Output: "leetcode"
 * Explanation:
 * Remove an 'e' from the first group of 'e's to create "leetcode".
 * No three consecutive characters are equal, so return "leetcode".
 * 
 * Example 2:
 * Input: s = "aaabaaaa"
 * Output: "aabaa"
 * Explanation:
 * Remove an 'a' from the first group of 'a's to create "aabaaaa".
 * Remove two 'a's from the second group of 'a's to create "aabaa".
 * No three consecutive characters are equal, so return "aabaa".
 * 
 * Example 3:
 * Input: s = "aab"
 * Output: "aab"
 * Explanation: No three consecutive characters are equal, so return "aab".
 * 
 * Constraints:
 * 1 <= s.length <= 105
 * s consists only of lowercase English letters.
 * 
 * My Approach:
 * We can take two pointers prev and count to store the previous unique elements and 
 * to count how many time the running same element has appeared respectively. If a
 * character is equal to prev then we should check if the element has appeared more 
 * than 2 times. If yes, skip. If no, then append the element to string builder. If 
 * it is not equal, then it is a unique element so reset the count pointer to 1, prev 
 * to the current element and append the character.
 * 
 * Complexity Analysis:
 * Time Complexity: 28ms, O(n)
 * Space Complexity: 46.28 MB, O(n)
 * 
 * @author Bipinkoirala
 * @version 1.0
 */
public class MakeFancyStrings {

    /**
     * Returns the fancy element after deleting needed characters
     * 
     * @param s String that needs editing
     * @return the edited fancy string
     */
    public String makeFancyString(String s) {
        //  Check if length of given string is less than 3. If so return the string.
        if (s.toCharArray().length < 3) {
            return s;
        }

        //  Convert string into array of characters
        char[] arr = s.toCharArray();
        //  Take the first element from array
        char prev = arr[0];
        //  Take a pointer at 1 to begin with
        int count = 1;
        //  String builder to take out the fancy string
        StringBuilder sb = new StringBuilder();

        //  Append the first element from array
        sb.append(prev);

        //  Loop over the array from second element 
        for (int i = 1; i < arr.length; i++) {
            //  If loop element is equal to previous element then
            if (arr[i] == prev) {
                //  add to the count
                count++;
                //  Append element to string builder only if the count is less than 3
                if (count <= 2) {
                    sb.append(arr[i]);
                }
            } else {
                //  Change the previous element to new element
                prev = arr[i];
                //  Reset the count
                count = 1;
                //  Append the element to string builder
                sb.append(arr[i]);
            }
        }
        //  return the string from string builder
        return sb.toString();
    }
}