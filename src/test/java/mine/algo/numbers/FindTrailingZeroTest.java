package mine.algo.numbers;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by pratapn on 4/6/16.
 */
public class FindTrailingZeroTest extends TestCase {

    public void testTrailingZeroes() throws Exception {
        FindTrailingZero findTrailingZero = new FindTrailingZero();
        int zeroCnt = findTrailingZero.trailingZeroes(1808548329);
        Assert.assertEquals(452137076, zeroCnt);
    }
}