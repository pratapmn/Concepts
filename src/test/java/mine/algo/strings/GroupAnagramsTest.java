package mine.algo.strings;

import junit.framework.TestCase;

/**
 * Created by pratapn on 4/7/16.
 */
public class GroupAnagramsTest extends TestCase {

    public void testGroupAnagrams() throws Exception {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String [] input = new String[]{"","b"};
        System.out.println(groupAnagrams.groupAnagrams(input));
    }
}