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
        ListNode curr = head;
        ListNode next , prev;
        next = prev = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode midNode = slow.next;
        slow.next = null;
        
        ListNode list2 = reverse(midNode);
        merge(head , list2);
    }
        
        void merge(ListNode list1 , ListNode list2){
            ListNode t1 = list1; 
            ListNode t2 = list2;
            while(t1 != null && t2 != null){
                ListNode next1 = t1.next;
                t1.next = t2;
                t2 = t2.next;
                t1 = t1.next;
                t1.next = next1;
                t1 = next1;
            }
        }
        
    
}