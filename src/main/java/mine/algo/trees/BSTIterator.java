package mine.algo.trees;

import java.util.*;

/**
 * Created by pratapn on 4/6/16.
 */
//Definition for binary tree
public class BSTIterator {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    Integer[] minSeq;
    int curMinIndex;

    private List<Integer> doBFSFindMin(TreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> minSeq = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);
        int min = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            TreeNode pop = q.remove();
            if (pop == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                }
                minSeq.add(min);
                min = Integer.MAX_VALUE;
            } else {
                if (pop.right != null) q.add(pop.right);
                if (pop.left != null) q.add(pop.left);
                min = Math.min(min, pop.val);
            }
        }
        return minSeq;
    }

    public BSTIterator(TreeNode root) {
        List<Integer> minSeqList = doBFSFindMin(root);
        if (minSeqList != null && minSeqList.size() != 0) {
            minSeq = minSeqList.toArray(minSeq);
        }
        curMinIndex = 0;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        if (minSeq == null || curMinIndex >= minSeq.length) {
            return false;
        }
        return true;
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return minSeq[curMinIndex++];
    }
}

