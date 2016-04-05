package mine.algo.strings;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pratapn on 4/4/16.
 */
public class GroupShiftedStringsTest extends TestCase {

    public void testDoGrouping() throws Exception {
        List<String> input = new ArrayList<>();
        input.add("abc");
        input.add("bcd");
        input.add("acef");
        input.add("xyz");
        input.add("az");
        input.add("ba");
        input.add("a");
        input.add("z");

        GroupShiftedStrings groupShiftedStrings = new GroupShiftedStrings();
        List<List<String>> result = groupShiftedStrings.doGrouping(input);
        System.out.println(result);
    }
}