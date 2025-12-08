/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();

        if(root1 == null && root2 == null){
            return true;
        }
        else if(root1==null || root2==null){
            return false;
        }

        find(root1,ls1);
        find(root2,ls2);

        return ls1.equals(ls2);
    }

    private void find(TreeNode root, List<Integer> ls){
        if(root == null ){
            return;
        }

        if(root.left == null && root.right == null){
            ls.add(root.val);
            return;
        }

        find(root.left,ls);
        find(root.right,ls);
    }
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> lp = new ArrayList<>();
        List<Integer> lq = new ArrayList<>();
        find(p,lp);
        find(q,lq);

        return lp.equals(lq);
    }

    private void find(TreeNode root, List<Integer> ls){
        if(root == null){
            ls.add(null);
            return;
        }

        ls.add(root.val);
        find(root.left,ls);
        find(root.right,ls);
    }
}