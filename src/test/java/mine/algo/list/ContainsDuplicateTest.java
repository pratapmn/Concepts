package mine.algo.list;

import junit.framework.TestCase;

/**
 * Created by pratapn on 4/12/16.
 */
public class ContainsDuplicateTest extends TestCase {

    public void testContainsNearbyAlmostDuplicate() throws Exception {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int [] input = new int []{3, 6, 0, 4};
        System.out.println(containsDuplicate.containsNearbyAlmostDuplicate(input, 2, 2));
    }
}