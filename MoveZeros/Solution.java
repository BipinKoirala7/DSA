package MoveZeros;

import java.util.Arrays;

/**
 * Moves every zero in an array to the end while preserving the order of
 * non-zero values.
 */
class Solution {

  public void moveZeros(int[] nums) {
    // Compact non-zero values to the front in one pass.
    int late = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[late] = nums[i];
        if (late != i)
          nums[i] = 0;
        late++;
      }
    }
  }

  public void moveZeros1(int[] nums) {
    // Count zeros first, then fill the tail with them.
    int countOfZeros = 0;
    int late = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        countOfZeros++;
        continue;
      }

      nums[late] = nums[i];
      late++;
    }

    while (countOfZeros > 0) {
      nums[nums.length - countOfZeros] = 0;
      countOfZeros--;
    }
  }

  // This would work if we could return the arrayl
  public void moveZeros2(int[] nums) {

    // Build a new array with non-zero values and copy it back conceptually.
    int[] sortedArray = new int[nums.length];
    int x = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        sortedArray[x] = nums[i];
        x++;
      }
    }

    System.out.println(Arrays.toString(sortedArray));

    nums = sortedArray;
  }
}