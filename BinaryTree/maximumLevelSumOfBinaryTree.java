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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int maxSum = Integer.MIN_VALUE;
        int level = 1;
        int ansLevel = 1;
        while(!q.isEmpty()){
            int curSum = 0;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode nod = q.poll();
                curSum += nod.val;

                if(nod.left != null){
                    q.add(nod.left);
                }
                if(nod.right != null){
                    q.add(nod.right);
                }
            }

            if(maxSum<curSum){
                maxSum = curSum;
                ansLevel = level;
            }
            level++;
            
        }
        return ansLevel;
    }
}