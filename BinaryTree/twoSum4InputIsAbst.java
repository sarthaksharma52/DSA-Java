// brute force time complexity O(n^2)



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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> ls = new ArrayList<>();

        find(ls,root);
        if(ls.size()<2){
            return false;
        }

        int[] arr = new int[ls.size()];

        for(int i=0;i<ls.size();i++){
            arr[i] = ls.get(i);
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == k){
                    return true;
                }
            }
        }

        return false;

    }

    public void find(List<Integer> ls,TreeNode root){
        if(root == null) {
            return;
        }
        find(ls,root.left);
        ls.add(root.val);
        find(ls,root.right);
    }
}



// optimal approach time complexity O(n)


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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> ls = new ArrayList<>();

        find(ls,root);

        int l = 0, r = ls.size()-1;
        while(l<r){
            int sum = ls.get(l) + ls.get(r);
            if(sum == k){
                return true;
            }
            else if(sum < k){
                l++;
            }
            else{
                r--;
            } 
        }
        return false;

    }

    public void find(List<Integer> ls,TreeNode root){
        if(root == null) {
            return;
        }
        find(ls,root.left);
        ls.add(root.val);
        find(ls,root.right);
    }
}