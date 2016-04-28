package mine.algo.company.cyanagen;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by pratapn on 4/28/16.
 */

/*
    0
            / \
            1   2
            /
            5


    t1 - 0#
    t2 - #12         l=2 m=0
    t3 = 12#          l=0, m=2
    t4 - 2#5         l=1, m=2
    t5 - #5           L=1, M=2
    t6 = 5#            L=0, M=2
    t7 = #            L=1, M=1
    t8
*/

public class MaxBreadth {
    class Node {

        Node left;
        Node right;
    }


    class BreakLineNode extends Node {
    }

    int maxWidthOfTree(Node root) {
        int maxSum = 0;
        if (root == null) return maxSum;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(new BreakLineNode());
        int localMax = 0;
        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node instanceof BreakLineNode) {
                if (localMax > maxSum) {
                    maxSum = localMax;
                }
                if (!q.isEmpty()) {
                    q.add(new BreakLineNode());
                    localMax = 0;
                }
            } else {
                if (node.left != null) {
                    q.add(node.left);
                    localMax++;
                }
                if (node.right != null) q.add(node.right);
                localMax++;
            }
        }
        return maxSum;
    }
}
