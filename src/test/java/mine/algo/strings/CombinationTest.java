package mine.algo.strings;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;

/**
 * Created by pratapn on 4/4/16.
 */
public class CombinationTest extends TestCase {

    public void testDoCombination() throws Exception {
        Combination combination = new Combination();
        List<String> combinations = combination.doCombination("aabcd".toCharArray());
        combinations.forEach(s -> {
            System.out.println(s);
        });
        Assert.assertEquals(combinations.size() - 1, 31);
    }
}