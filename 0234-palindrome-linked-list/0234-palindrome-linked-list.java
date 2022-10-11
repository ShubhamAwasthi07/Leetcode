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
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode curr = slow;
        ListNode prev = null;
        ListNode next = null;
        
        while(curr != null){
            
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode rev = prev;
        while(rev != null){
            if(rev.val != head.val){
                return false;
            }
            rev = rev.next;
            head = head.next;
        }
        return true;
        
    }
}