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
    public ListNode reverse(ListNode head){
        ListNode curr;
        ListNode next , prev;
        curr = head;
        next = prev = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ListNode newHead = reverse(head);
        ListNode prev , temp;
        temp = newHead;
        prev = null; 
        if(n == 1) return reverse(newHead.next);
        
        for(int i = 1 ; i < n ; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return reverse(newHead);
    }
}