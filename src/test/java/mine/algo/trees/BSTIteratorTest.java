package mine.algo.trees;

import junit.framework.TestCase;

/**
 * Created by pratapn on 4/6/16.
 */
public class BSTIteratorTest extends TestCase {

    public void testHasNext() throws Exception {
        BSTIterator.TreeNode root = new BSTIterator.TreeNode(1);
        BSTIterator i = new BSTIterator(root);
        while (i.hasNext()) {
            System.out.println(i.next());
        };
    }

    public void testNext() throws Exception {

    }
}