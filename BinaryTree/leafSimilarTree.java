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