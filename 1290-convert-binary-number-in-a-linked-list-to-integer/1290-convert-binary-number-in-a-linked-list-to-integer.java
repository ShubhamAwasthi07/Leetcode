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
    public int getDecimalValue(ListNode head) {
        
        ListNode temp = head;
        String ans = "";
        while(temp != null){
            ans = ans + String.valueOf(temp.val);
            temp = temp.next;
        }
        System.out.print(ans);
        return Integer.parseInt(ans,2);
    }
}