package mine.algo.strings;

import junit.framework.TestCase;

import java.util.List;

/**
 * Created by pratapn on 4/4/16.
 */
public class GroupShiftedStringsTest extends TestCase {

    public void testDoGrouping() throws Exception {
        String [] input = new String [] {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
        GroupShiftedStrings groupShiftedStrings = new GroupShiftedStrings();
        List<List<String>> result = groupShiftedStrings.doGrouping(input);
        System.out.println(result);
    }
}