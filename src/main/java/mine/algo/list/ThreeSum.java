package mine.algo.list;

import java.util.*;

/**
 * Created by pratapn on 4/9/16.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length < 3) {
            return Collections.EMPTY_LIST;
        }
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, String> sum = new HashMap<Integer, String>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum.put(i + j, i + ":" + j);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int value = -nums[i];
            if (sum.get(value) != null) {
                String numStr = sum.get(value);
                String[] numStrAry = numStr.split(":");
                List<Integer> numbers = new ArrayList<Integer>();
                for (String str : numStrAry) {
                    numbers.add(Integer.parseInt(str));
                }
                numbers.add(-value);
                result.add(numbers);
            }
        }
        return result;
    }
}
