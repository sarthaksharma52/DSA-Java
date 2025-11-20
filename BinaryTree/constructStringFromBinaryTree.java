class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        build(root, sb);
        return sb.toString();
    }

    private void build(TreeNode node, StringBuilder sb) {
        sb.append(node.val);

        if (node.left != null || node.right != null) {

            sb.append("(");
            if (node.left != null) {
                build(node.left, sb);
            }
            sb.append(")");

            if (node.right != null) {
                sb.append("(");
                build(node.right, sb);
                sb.append(")");
            }
        }
    }
}
