/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;//swaped the value of node with next.
        node.next= node.next.next;// just kept the pointer from node to next to next to next item.

    }
}


//https://leetcode.com/problems/delete-node-in-a-linked-list/
