package ContainsDuplicate2;

import java.util.HashSet;
import java.util.Set;

/**
 * Checks whether an array has duplicate values within distance k.
 */
public class ContainsDuplicate {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    // Keep a sliding window of the last k values.
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i]))
        return true;
      set.add(nums[i]);
      if (set.size() > k) {
        set.remove(nums[i - k]);
      }
    }
    return false;
  }
}
