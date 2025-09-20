
/**
 * Title: Two sum
 * Problem: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up 
 * to target.
 * Link: https://leetcode.com/problems/two-sum/description/
 * 
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2: 
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Explanation: Because nums[1] + nums[2] == 6, we return [1,2].
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 6, we return [0, 1].
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Approach: My Approach is to have a HashMap that will store a key and value both of integer. Then, loop through the given
 *          number array. While looping, we should check if the target - num, which is the number currently in loop, is
 *          already there. If it is present, then we should return a new integer array which will have the index of the
 *          current loop and the index of the number target - num. Else, we should just add the index and number to the hash
 *          map and then continue with the loop forward. If the number array (nums) doesn't have the numbers that fullfil the
 *          given condition, then we just return an empty array at the end.
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pairIdx = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (pairIdx.containsKey(target - num)) {
                return new int[] { i, pairIdx.get(target - num) };
            }
            pairIdx.put(num, i);
        }

        return new int[] {};  
    }
}
