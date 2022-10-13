//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    
    static Node add(Node l1 , Node l2 , int carry){
        
        if(l1 == null && l2 == null){
            if(carry == 0){
                return null;
            }
            else{
                return new Node(carry);
            }
        }
        if(l1 == null){
            
            if(carry == 0){
                return l2;
            }
            else{
                Node temp = new Node(carry);
                return add(temp , l2 , 0);
            }
        }
        if(l2 == null){
            if(carry == 0)
                return l1;
            else{
                Node temp = new Node(carry);
                return add(l1 , temp , 0);
            }
        }
        
        int sum = l1.data + l2.data + carry;
        int val = sum % 10;
        Node temp = new Node(val);
        int carryNew = sum / 10;
        temp.next = add(l1.next , l2.next , carryNew);
        
        return temp;
    }
    static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        Node list1 = reverse(first);
        Node list2 = reverse(second);
        Node ans = add(list1 , list2 , 0);
        Node res = reverse(ans);
        return res;
    }
}