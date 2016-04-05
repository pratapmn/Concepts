package mine.algo.strings;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;

/**
 * Created by pratapn on 3/28/16.
 */
public class PermutationTest extends TestCase {

    public void testPermutation() throws Exception {
        Permutation permTest = new Permutation();
        char[] a = "aabcd".toCharArray();
        List<String> permutations = permTest.doPermutation(a);
        permutations.forEach( s -> {
            System.out.println(s);
        });
        Assert.assertEquals(permutations.size(), 120);
    }
}