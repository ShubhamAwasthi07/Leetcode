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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode odh = new ListNode(-1);
        ListNode odt = odh;
        
        ListNode edh = new ListNode(-1);
        ListNode edt = edh;
        
        int pos = 1;
        ListNode temp = head;
        
        while(temp != null){
            if(pos % 2 == 0){
                edt.next = temp;
                edt = edt.next;
            }
            else{
                 odt.next = temp;
                 odt = odt.next;
            }
            temp = temp.next;
            pos++;
            
        }
        odt.next = edh.next;
        edt.next = null;
        return odh.next;
        
    }
}