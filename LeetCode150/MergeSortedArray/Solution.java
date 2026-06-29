package LeetCode150.MergeSortedArray;

/**
 * Title: Merge Sorted Array
 * Link: https://leetcode.com/problems/merge-sorted-array/
 * 
 * My Approach:
 * Single Merge sort
 */
public class Solution {

  // O(m+n) Beats 100%
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    if (nums1.length == 0) {
      nums1 = nums2;
      return;
    }
    if (nums2.length == 0) {
      return;
    }
    int j = 0;
    int k = 0;
    int[] nums = new int[nums1.length];
    System.arraycopy(nums1, 0, nums, 0, nums1.length);
    for (int i = 0; i < nums.length; i++) {
      if (k >= n) {
        nums1[i] = nums[j];
        j++;
      } else if (j >= m) {
        nums1[i] = nums2[k];
        k++;
      } else {
        if (nums[j] > nums2[k]) {
          nums1[i] = nums2[k];
          k++;
        } else {
          nums1[i] = nums[j];
          j++;
        }
      }
    }
  }

  // Inwards, from last index O(n) Beats 100%
  public void merge1(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;

    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j])
        nums1[k--] = nums1[i--];
      else
        nums1[k--] = nums2[j--];
    }

    while (j >= 0)
      nums1[k--] = nums2[j--];
  }
}
