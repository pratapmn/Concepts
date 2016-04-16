package mine.algo.list;

import java.util.Arrays;

/**
 * Created by pratapn on 4/9/16.
 */
public class ClosestThreeSum {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }

        Arrays.sort(nums);
        int targetDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i;
            int high = nums.length;
            while (low < high) {
                low++;
                high--;
                int sum = nums[i] + nums[low] + nums[high];
                int diff = target > sum ? target - sum : sum - target;
                if (diff < targetDiff) {
                    targetDiff = diff;
                    low++;
                } else if (diff > targetDiff) {
                    high--;
                }
                while (low < high && nums[low] == nums[low + 1]) low++;
                while (low < high && nums[high] == nums[high - 1]) high--;
            }
        }
        return target > targetDiff ? target - targetDiff : targetDiff - target;
    }
}
