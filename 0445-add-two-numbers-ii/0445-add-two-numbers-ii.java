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
        
        if(head == null)
            return head;
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
    public ListNode add(ListNode l1 , ListNode l2 , int carry){
        
        if(l1 == null && l2 == null){
            if(carry == 0){
                return null;
            }
            else{
                return new ListNode(carry);
            }
        }
        
        if(l1 == null){
            if(carry == 0){
                return l2;
            }
            else{
                ListNode temp = new ListNode(carry);
                return add(temp , l2 , 0);
            }
        }
        
        if(l2 == null){
            if(carry == 0){
                return l1;
            }
            else{
                ListNode temp = new ListNode(carry);
                return add(l1 , temp , 0);
            }
        }
        
        int sum = l1.val + l2.val + carry;
        int val = sum % 10;
        ListNode temp = new ListNode(val);
        int newCarry = sum / 10;
        
        temp.next = add(l1.next , l2.next , newCarry);
        
        return temp;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode list1 = reverse(l1);
        ListNode list2 = reverse(l2);
        
        return reverse(add(list1 , list2 , 0));
        
    }
}