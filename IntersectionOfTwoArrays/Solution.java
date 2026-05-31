package IntersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {

  // Taken from LeetCode solutions Page.
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> hashSet = new HashSet<>();
    List<Integer> list = new ArrayList<>();

    for (int num : nums1) {
      hashSet.add(num);
    }

    for (int num : nums2) {
      if (hashSet.contains(num)) {
        list.add(num);
        hashSet.remove(num);
      }
    }

    int[] nums = new int[list.size()];
    for (int i = 0; i < list.size(); i++)
      nums[i] = list.get(i);
    return nums;
  }

  // Runtime Time: 9ms, Beats: 8.90%
  // Memory Space: 44.87MB, Beats: 70.66%
  int i = 0;

  public int[] intersection1(int[] nums1, int[] nums2) {
    HashSet<Integer> hashSet = new HashSet<>();
    if (nums1.length > nums2.length) {
      for (int i = 0; i < nums2.length; i++) {
        if (hashSet.contains(nums2[i]))
          continue;
        for (int j = 0; j < nums1.length; j++) {
          if (nums2[i] == nums1[j]) {
            hashSet.add(nums2[i]);
          }
        }
      }

    } else {
      for (int i = 0; i < nums1.length; i++) {
        if (hashSet.contains(nums1[i]))
          continue;
        for (int j = 0; j < nums2.length; j++) {
          if (nums1[i] == nums2[j]) {
            hashSet.add(nums1[i]);
          }
        }
      }
    }

    int[] returnIntArr = new int[hashSet.size()];
    hashSet.stream().forEach(num -> {
      returnIntArr[i] = num;
      i++;
    });

    return returnIntArr;
  }
}
