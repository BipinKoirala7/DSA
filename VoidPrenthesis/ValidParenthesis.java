/**
 * Title: Void Parenthesis
 * Problem: Given a string s containing just the characters '(', ')', '{',
 * '}','[' and ']', determine if the input string is
 * valid.
 * Link: https://leetcode.com/problems/valid-parentheses/
 * 
 * An input string is valid if:
 * 1) Open brackets must be closed by the same type of brackets.
 * 2) Open brackets must be closed in the correct order.
 * 3) Every close bracket has a corresponding open bracket of the same type.
 * 
 * Example 1:
 * Input: s = "()"
 * Output: true
 * 
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * 
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * 
 * Example 4:
 * Input: s = "([])"
 * Output: true
 * 
 * Example 5:
 * Input: s = "([)]"
 * Output: false
 * 
 * Constraints:
 * - 1 <= s.length <= 10^4
 * - s consists of parenthesis only '(){}[]'
 * 
 * Approach: By using a string builder and character array from
 * string.toCharArray() we can check using a loop.
 * Inside the loop, we should check if the string builder is empty, if yes then
 * we should append the current character from the character array and then
 * continue to another iteration of loop. If no, then move to next line. Take
 * the previous character from the builder that was appended and character right
 * now and take their ascii value in a variable. Then look if the now - prev is
 * greater then 0 and now - prev is less than 3. It is because the ascii value
 * of parenthesis has maximum difference of 3 between pair. (:40, ):41, {:123,
 * }:125, [: 91, ]:125. If yes, then we should delete because that means the
 * last one was the pair for the current one if not then append current one to
 * the builder and continue advancing in loop. At last, when loop finishes
 * return true if string builder length is 0. If not, false.
 * 
 * Complexity Analysis: 
 * Time: 2ms
 * Time Complexity: O(n)
 * Memory Space: 41.75 MB
 * Space Complexity: O(n)
 */

public class ValidParenthesis {

    /**
     * Checks if the given string has a complete subsequence pair of (),{} or []
     * 
     * @param s It is the given string which would be checked for presence of brackets
     * @return true if the string has (),{} or [] and false if the string has none or incomplete pair.
     */
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArrayFromString = s.toCharArray();

        // Loop through the character array created from the parameter string s to check the presence
        for (char c : charArrayFromString) {
            // Check if it is empty or not
            if (sb.isEmpty()) {
                sb.append(c);
                continue;
            }
            // Get the ASCII value for characters
            int prev = (int) sb.charAt(sb.length() - 1);
            int now = (int) c;

            // Check the difference with the last character in string builder
            if (now - prev > 0 && now - prev < 3) {
                sb.deleteCharAt(sb.length() - 1);
                continue;
            }
            // add the character to the string builder
            sb.append(c);
        }
        // return false if string builder is left with a string else true.
        return sb.length() == 0;
    }
}
