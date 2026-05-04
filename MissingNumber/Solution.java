package MissingNumber;

import java.util.Arrays;
import java.util.HashMap;

class Solution {

  // Beats all of the below solutions
  public int misingNumber(int[] nums) {
    int number = 0;
    int[] realArray = new int[nums.length + 1];

    for (int i = 0; i < nums.length; i++) {
      System.out.println("Loop ------------ cycle: " + i);
      realArray[nums[i]] = nums[i];
    }

    for (int i = 0; i < realArray.length; i++) {
      if (i != 0 && realArray[i] == 0) {
        number = i;
        break;
      }
      if (realArray[i] > i) {
        number = i;
        break;
      }
    }

    System.out.println(Arrays.toString(realArray));

    return number;
  }

  public int misingNumber2(int[] nums) {
    int number = 0;

    Arrays.sort(nums);

    System.out.println("Sorted Array: " + Arrays.toString(nums));

    for (int i = 0; i <= nums.length; i++) {
      System.out.println("Loop Start---------- cycle: " + i);
      if (i == nums.length) {
        System.out.println("i is eqauls to the array length");

        number = i;
        break;
      }
      if (i != nums[i]) {
        System.out.println("i is not matching with the number");
        number = i;
        break;
      }
    }

    return number;
  }

  public int misingNumber1(int[] nums) {
    int number = 0;
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    for (int i = 0; i <= nums.length; i++) {
      if (i == nums.length) {
        hashMap.put(i, null);
        continue;
      }
      hashMap.put(i, nums[i]);
    }

    for (Integer key : hashMap.keySet()) {
      if (!hashMap.containsValue(key)) {
        number = key;
      }
    }

    return number;
  }
}