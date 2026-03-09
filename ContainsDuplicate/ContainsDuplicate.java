package ContainsDuplicate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> seen = new HashSet<>();
    for(int num : nums){
      if(seen.contains(num)){
        return true;
      }
      seen.add(num);
    }
    return false;
  }
  public boolean containsDuplicate2(int[] nums) {
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i-1]) {
        return true;
      }
    }
    return false;
  }

  public boolean containsDuplicate3(int[] nums) {
    HashMap<Integer, Boolean> hashMap = new HashMap<>();

    for (int num : nums) {
      if (hashMap.containsKey(num)) {
        hashMap.put(num, true);
        continue;
      }
      hashMap.put(num, false);
    }
    return hashMap.containsValue(true);
  }
}
