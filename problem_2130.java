/*
2130. Maximum Twin Sum of a Linked List
In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.
    For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
The twin sum is defined as the sum of a node and its twin. */
class Solution {
    public int pairSum(ListNode head) {
        int n = 0, sum = Integer.MIN_VALUE;
        ListNode curr = head;
        while(curr != null){
            n++;
            curr = curr.next;
        }
        if(n%2 != 0){
            return -1;
        }
        else{
            int arr[] = new int[n];
            curr = head;
            for(int i = 0;i<n;i++, curr = curr.next){
                arr[i] = curr.val;
            }
            for(int i = 0;i<n/2;i++){
                if(arr[i] + arr[n-1-i] > sum){
                    sum = arr[i] + arr[n-1-i];
                }
            }
        }
        return sum;
    }
}