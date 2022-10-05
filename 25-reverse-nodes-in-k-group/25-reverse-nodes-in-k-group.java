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
    
    public ListNode reverse(ListNode head , int k , int nodes){
        
        if(nodes <= 0) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        int count = 0;
        
        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        
        head.next = reverse(curr , k , --nodes);
        
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp = head;
        int nodes = 0;
        
        while(temp != null){
            nodes++;
            temp = temp.next;
        }
        nodes = nodes / k;
        head = reverse(head , k , nodes);
        return head;
    }
}