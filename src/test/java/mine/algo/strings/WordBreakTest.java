package mine.algo.strings;

import junit.framework.TestCase;

import java.util.*;

/**
 * Created by pratapn on 4/4/16.
 */
public class WordBreakTest extends TestCase {

    public void testDoWordBreak() throws Exception {
        Set<String> dict = new HashSet<>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
        WordBreak wordBreak = new WordBreak();
        List<String> result = wordBreak.wordBreak("catsanddog", dict);
        System.out.println(result);

    }
}