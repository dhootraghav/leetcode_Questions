/*
199. Binary Tree Right Side View
Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom. */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, 0, ans);
        return ans;
    }
    private void dfs(TreeNode node, int depth, List<Integer> ans) {
        if (node == null) return;
        if (depth == ans.size()) {
            ans.add(node.val);
        }
        dfs(node.right, depth + 1, ans);
        dfs(node.left, depth + 1, ans);
    }
}
