package mine.algo.list;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;

/**
 * Created by pratapn on 4/6/16.
 */
public class SubsetsTest extends TestCase {

    public void testSubsets() throws Exception {
        int[] nums = new int[]{1,2,3};
        Subsets subsets = new Subsets();
        List<List<Integer>> result = subsets.subsets(nums);
        Assert.assertEquals(result.toString(), "[[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]");
    }
}