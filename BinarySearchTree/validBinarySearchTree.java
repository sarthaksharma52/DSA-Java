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
    public boolean isValidBST(TreeNode root) {
        List<Integer> ls = new ArrayList<>();

        find(root,ls);
        int[] arr = new int[ls.size()];

        for(int i=0;i<ls.size();i++){
            arr[i] = ls.get(i);
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    private void find(TreeNode root, List<Integer> ls){
        if(root == null){
            return;
        }

        find(root.left,ls);
        ls.add(root.val);
        find(root.right,ls);
    }
}