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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ls = new ArrayList<>();
        if (root == null) return ls;
        String str = Integer.toString(root.val);
        path(ls,root,str);
        return ls;
    }
    public static void path(List<String> ls,TreeNode root,String str){

        if (root == null) return;

        if(root.left == null && root.right == null){
            ls.add(str);
            return;
        }

        if(root.left != null){
            path(ls,root.left,str+"->"+root.left.val);
        }
        
        if(root.right != null){
            path(ls,root.right,str+"->"+root.right.val);
        }
        
    }
}