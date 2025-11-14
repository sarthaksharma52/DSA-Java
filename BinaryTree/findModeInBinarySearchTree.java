class Solution {
    Integer prev = null;
    int count = 0;
    int maxCount = 0;
    List<Integer> ans = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) res[i] = ans.get(i);
        return res;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        if (prev == null || root.val != prev) {
            count = 1;
        } else {
            count++;
        }

        if (count > maxCount) {
            maxCount = count;
            ans.clear();
            ans.add(root.val);
        } else if (count == maxCount) {
            ans.add(root.val);
        }

        prev = root.val;

        inorder(root.right);
    }
}
