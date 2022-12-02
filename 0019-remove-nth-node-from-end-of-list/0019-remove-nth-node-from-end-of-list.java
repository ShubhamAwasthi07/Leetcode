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
    
    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null)
            return head;
        
        ListNode reverseList = reverse(head);
        ListNode temp = reverseList;
        ListNode prev = null;
        if(n == 1)
            return reverse(reverseList.next);
        
        for(int i = 1 ; i < n ; i++){
            prev = temp;
            temp = temp.next;
        }
        
        prev.next = temp.next;
        return reverse(reverseList);
    }
}