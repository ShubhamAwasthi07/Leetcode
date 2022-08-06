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
    public ListNode rotateRight(ListNode head, int k) {
    
    if(head == null || head.next == null || k == 0) return head;        
            
    ListNode cur = head;
    
    // Step 1: First Count the no. of node in LL
    int c = 1;
    while(cur.next != null){
        c++;
        cur = cur.next;
    }
    
    // Step 2 : Last nodes next should point to head. i.e make Circular LL.
    cur.next = head;
    
    // Step 3 : Remove the extra rotations by doing modulo.
    k = k % c;
    
    // Total no. of nodes  - no. of rotaions from end to react the end node.
    k = c - k;        
    while(k-- > 0) cur = cur.next;
    
    // Step 4 : Make the next node as head and Make the reached node's next to null
    head = cur.next;
    cur.next = null;
    
    return head;
   }
    
}