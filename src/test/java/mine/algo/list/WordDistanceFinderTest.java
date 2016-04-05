package mine.algo.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Pratap on 4/5/16.
 */
public class WordDistanceFinderTest {

    @Test
    public void testDistance() throws Exception {
        WordDistanceFinder finder = new WordDistanceFinder(Arrays.asList("the", "quick", "brown", "fox", "quick"));
        assert(finder.distance("fox","the") == 3);
        Assert.assertEquals(finder.distance("quick", "fox"), 1);
    }
}