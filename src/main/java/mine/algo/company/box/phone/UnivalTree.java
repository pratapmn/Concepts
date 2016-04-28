package mine.algo.company.box.phone;

/**
 * Created by pratapn on 4/12/16.
 */
public class UnivalTree {

    /*
    public static class Node {
        Node right;
        Node left;
        Integer val;
    }

    private boolean isUniVal(Node root){
        if(root == null){
            return true;
        }

        boolean e1 = isUniVal(root.left);
        boolean e2 = isUniVal(root.right);
        if(e1 && e2){
            boolean e3 = false;
            if(root.left.val != null ) {
                if(root.val == root.left.val){
                    e3 = true;
                }

            } else {
                e3 = true;
            }

            boolean e4 = false;
            if(root.right.val != null ) {
                if(root.val == root.right.val){
                    e4 = true;
                }

            } else {
                e4 = true;
            }

            if(e3 && e4){
                return true;
            } else {return false;}
        } else {
            return false;
        }
    }

    public boolean checkUniVal(Node root){
        return isUniVal(root);
    }

    private Tuple<Integer, Boolean> countUniVal(Node root){

        if(root == null){
            return 0;
        }
        Tuple c1 = countUniVal(root.left);
        Tuple c2 = countUniVal(root.right);
        boolean e3 = false;
        if(root.left != null && root.left.val != null ) {
            if(root.val == root.left.val){
                e3 = true;
            }

        } else {
            e3 = true;
        }
        // Similar for root.right
        if(e3 && e4) {
            int output = 0;
            if(c1.val2){
                output += c1.val1;
            }
            if(c2.val2){
                output += c2.val1;
            }
            return output;
        } else {
            return c1 + c2;
        }

    }

    private class Tuple<T, T1> {
    }

    */
}
