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
    public int findSecondMinimumValue(TreeNode root) {

        int min = root.val;
        long secondMin = Long.MAX_VALUE;
        secondMin = find(root,min,secondMin);
        return secondMin == Long.MAX_VALUE ? -1 : (int) secondMin;

    }

    private long find(TreeNode root,int min , long secondMin){
        if(root == null ){
            return secondMin;
        }
        if(root.val>min && root.val<secondMin){
            secondMin = root.val;
        }

        secondMin = find(root.left,min,secondMin);
        secondMin = find(root.right,min,secondMin);

        return secondMin;
    }
}