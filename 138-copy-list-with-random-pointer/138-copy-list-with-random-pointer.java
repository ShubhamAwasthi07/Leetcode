/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummy = new Node(0);
        Node copy = dummy;
        Node temp = head;
        Map<Node , Node> hm = new HashMap<>();
        while(temp != null){
            copy.next = new Node(temp.val);
            copy = copy.next;
            
            hm.put(temp , copy);
            temp = temp.next;
        }
        
        temp = head;
        while(temp != null){
            Node x = hm.get(temp);
            x.random = hm.get(temp.random);
            temp = temp.next;
        }
        return dummy.next;
    }
}