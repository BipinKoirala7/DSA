package LeetCode150.RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

/**
 * Title: Remove Duplicates From Sorted Array II
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * 
 * My Approach:
 * We can solve this with two pointer solution method where there is a faster
 * pointer that increments at each loop and slower pointer that only increments
 * when count remains below 3.
 * 
 * Complexity Analysis:
 * Time Complexity: 0ms O(N) (Beats 100%)
 * Space Complexity: 48.65MB
 * 
 * @author Bipin Koirala
 */
public class Solution {

  /**
   * Returns the length of the array upto where the answer values goes
   * 
   * @param nums the array of which duplicates are to be removed
   * @return the length up to which the nums have modified and accepted values
   */
  public int removeDuplicates(int[] nums) {
    System.out.println(Arrays.toString(nums));

    int x = 1;
    int prev = nums[0];
    int count = 1;
    int totalElements = 1;

    for (int i = 1; i < nums.length; i++) {
      if (prev == nums[i]) {
        count++;
      } else {
        count = 1;
      }

      if (count <= 2) {
        nums[x] = nums[i];
        x++;
        totalElements++;
      }

      prev = nums[i];
    }

    System.out.println(Arrays.toString(nums));
    return totalElements;
  }
}
