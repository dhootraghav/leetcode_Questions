/*
1161. Maximum Level Sum of a Binary Tree
Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.
Return the smallest level x such that the sum of all the values of nodes at level x is maximal. */

class Solution {
    public int maxLevelSum(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int sum = Integer.MIN_VALUE, check_sum = 0, cal = 0, ans = 0;
        while(!queue.isEmpty()){
            int length = queue.size();
            cal += 1;
            for(int i=0;i<length;i++){
                TreeNode node = queue.poll();
                check_sum += node.val;
                if(node.left != null){
                    queue.offer(node.left);
                } 
                if(node.right != null){
                    queue.offer(node.right);
                } 
            }
            if(check_sum > sum){
                sum = check_sum;
                ans = cal;
            }
            check_sum = 0;
        }
        return ans;
    }
}