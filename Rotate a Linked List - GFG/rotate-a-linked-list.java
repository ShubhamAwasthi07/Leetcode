//{ Driver Code Starts
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int a = sc.nextInt();
            Node head = new Node(a);
            Node tail = head;
            
            for (int i=0; i<n-1; i++)
            {
                a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution ob = new Solution();
            head = ob.rotate(head,k);
            printList(head);
        }
    }
    
    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    
    // public Node reverse(Node head){
    //     Node curr = head;
    //     Node next = null;
    //     Node prev = null;
        
    //     while(curr != null){
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     return prev;
    // }
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        int len = 0;
        Node p = head;
        while(p != null){
            p = p.next;
            len++;
        }
        
        if(len == k)
            return head;
            
        Node temp = head;
        Node prev = null;
        for(int i = 0 ; i < k ; i++){
            prev = temp;
            temp = temp.next;
        }
        // Node List = reverse(head);
        prev.next = null;
        Node newHead = temp;
        Node t = null;
        while(temp != null){
            t = temp;
            temp = temp.next;
        }
        t.next = head;
        return newHead;
    }
}
