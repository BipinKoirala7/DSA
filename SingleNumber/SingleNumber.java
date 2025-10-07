package SingleNumber;

/**
 * Title: Single Number
 * Link: https://leetcode.com/problems/single-number/description/
 * Problem: Given a non-empty array of integers nums, every element appears twice except for one. 
 * Find that single one
 * 
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 
 * Example 1: 
 *  Input: nums = [2,2,1]
 *  Output: 1
 * 
 * Example 2: 
 *  Input: nums = [4,1,2,1,2]
 *  Output: 4
 * 
 * Example 3: 
 *  Input: nums = [1]
 *  Output: 1
 * 
 * Constraints:
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Each element in the array appears twice except for one element which appears only once
 * 
 * My Approach: 
 * We can do bitwise XOR operation on all number and the number which is different will be
 * the only one to remain a last. That number is the single number which is unique in nums.
 * 
 * Complexity Analysis: 
 * Time: 1ms
 * Time Complexity: O(n)
 * Space: 45.99 MB
 * Space Complexity: O(1)
 * 
 * @author Bipinkoirala
 * @version 1.0
 * 
 */

public class SingleNumber {
    /**
     * Finds a single number which hasn't repeated using bitwise operation.
     * 
     * @params nums an array of integers
     * @returns a single non repetitive unique number in nums
     */
    public int singleNumber(int[] nums) {
        // Initialize a variable to store unique single number.
        int res = 0;
        // For loop for performing bitwise operations
        for (int n : nums) {
            res ^= n;
        }
        // Return the number
        return res;
    }
}