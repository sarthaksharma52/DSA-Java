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
    int xdepth = -1;
    int ydepth = -1;
    TreeNode xParent = null, yParent = null;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return true;

        find(root,null,0,x,y);
        return xdepth == ydepth && xParent != yParent;
    }

    private void find(TreeNode root, TreeNode parent , int depth, int x, int y){
        if(root == null){
            return;
        }

        if(root.val == x){
            xdepth = depth;
            xParent = parent;
        }

        if(root.val == y){
            ydepth = depth;
            yParent = parent;
        }

        find(root.left,root,depth+1,x,y);
        find(root.right,root,depth+1,x,y);
    }
}