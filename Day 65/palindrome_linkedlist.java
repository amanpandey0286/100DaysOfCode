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
    public boolean isPalindrome(ListNode head) {
        Queue<Integer> q = new LinkedList<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        while(head != null) {
            q.add(head.val);
            s.push(head.val);
            head = head.next;
        }

        while(!s.isEmpty()) {
            if(q.remove() != s.pop()) {
                return false;
            }
        }

        return true;

    }
}

//https://leetcode.com/problems/palindrome-linked-list/description/
