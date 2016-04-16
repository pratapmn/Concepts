package mine.algo.list;

import junit.framework.TestCase;

/**
 * Created by pratapn on 4/9/16.
 */
public class ClosestThreeSumTest extends TestCase {

    public void testThreeSumClosest() throws Exception {
        ClosestThreeSum closestThreeSum = new ClosestThreeSum();
        int [] input = new int[]{1,1,1,0};
        int target = -100;
        int result = closestThreeSum.threeSumClosest(input, target);
        System.out.println(result);
    }
}