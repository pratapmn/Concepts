package mine.algo.list;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Pratap on 4/5/16.
 */
public class WordDistanceFinderTest {

    @Test
    public void testDistance() throws Exception {
        WordDistance finder = new WordDistance(new String[]{"the", "quick", "brown", "fox", "quick"});
        Assert.assertEquals(3, finder.shortest("fox", "the"));
        Assert.assertEquals(1, finder.shortest("quick", "fox"));
    }
}