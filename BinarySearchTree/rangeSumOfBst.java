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
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> ls = new ArrayList<>();

        list(root,low,high,ls);
        int[] arr = new int[ls.size()];
        int sum = 0;

        for(int i=0;i<ls.size();i++){
            arr[i] = ls.get(i);
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=low && arr[i]<=high){
                sum += arr[i];
            }
        }

        return sum;
    }

    private void list(TreeNode root, int low,int high, List<Integer> ls){
        if(root == null){
            return;
        }

        list(root.left,low,high,ls);
        ls.add(root.val);
        list(root.right,low,high,ls);
    }
}