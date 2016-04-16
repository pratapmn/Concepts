package mine.algo.list;

import java.util.*;

/**
 * Created by pratapn on 4/12/16.
 */
public class ContainsDuplicate {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        // Load a hashmap with value to index
        Map<Integer, List<Integer>> indexL = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (indexL.containsKey(nums[i])) {
                indexL.get(nums[i]).add(i);
            } else {
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(new Integer(i));
                indexL.put(nums[i], temp);
            }
        }

        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int num1 = nums[i];
        int num2 = nums[j];
        while (i < j) {
            num1 = nums[i];
            num2 = nums[j];
            int val = nums[j] - nums[i];
            if (val == t) break;
            if (val < t) i++;
            else j--;
        }

        Set<Integer> numSet = new LinkedHashSet<>();
        numSet.addAll(indexL.get(num1));
        numSet.addAll(indexL.get(num2));
        Integer [] indexSet = new Integer[numSet.size()];
        numSet.toArray(indexSet);
        Arrays.sort(indexSet);
        i = 0;
        j = indexSet.length - 1;
        int i1 = indexSet[i];
        int i2 = indexSet[j];
        while (i < j) {
            i1 = indexSet[i];
            i2 = indexSet[j];
            int val = indexSet[j] - indexSet[i];
            if (val == k) break;
            if (val < t) i++;
            else j--;
        }
        if ((num2 - num1) <= t && (i2 - i1) <= k) {
            return true;
        } else {
            return false;
        }
    }
}
