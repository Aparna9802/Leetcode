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
    public ListNode partition(ListNode head, int x) {
        
        ListNode node=new ListNode(0);
        
        ListNode tail=new ListNode(1);
         ListNode node1=node;
        
        ListNode tail1=tail;
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.val<x)
            {
               
                node.next=temp;
                node=temp;   
            }
            else  
            { 
                tail.next=temp;
                tail=temp;    
            }
      
            temp=temp.next;
        }
        node.next=tail1.next;
        tail.next=null;
  
        return node1.next;
        
    }
}