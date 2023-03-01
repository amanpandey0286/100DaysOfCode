/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int size  = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        

        int reqMiddle = 0;

        if((size%2) == 0){
            reqMiddle = (size/2)+1;
        }else{
            reqMiddle = (size/2)+1;
        }

        while(reqMiddle-->1){
            head = head.next;
        }

        return head;
        
    }
}


//https://leetcode.com/problems/middle-of-the-linked-list/description/
