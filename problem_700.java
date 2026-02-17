/*
700. Search in a Binary Search Tree
You are given the root of a binary search tree (BST) and an integer val.
Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null. */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        if(root == null) return root;
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.val == val) return node;
            if(val < node.val && node.left != null) queue.offer(node.left);
            if(val > node.val && node.right != null) queue.offer(node.right);
        }
        return null;
    }
}