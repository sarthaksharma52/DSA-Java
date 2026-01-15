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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> ls = new ArrayList<>();

        inorder(root,ls);
        int[] arr = new int[ls.size()];

        for(int i=0;i<ls.size();i++){
            arr[i] = ls.get(i);
        }

        return balance(arr,0,arr.length-1);
    }

    private void inorder(TreeNode root, List<Integer> ls){
        if(root == null){
            return;
        }
        inorder(root.left,ls);
        ls.add(root.val);
        inorder(root.right,ls);
    }

    private TreeNode balance(int[] arr,int start,int end){
        int mid = (start + end)/2;

        if(start>end){
            return null;
        }

        TreeNode root = new TreeNode(arr[mid]);
        root.left = balance(arr,start,mid-1);
        root.right = balance(arr,mid+1,end);

        return root;
    }
}