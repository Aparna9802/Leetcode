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
            System.out.println(temp.val);
            if(temp.val<x)
            {
               
                node.next=temp;
                node=temp;
                 System.out.println("node is"+node.val);
            }
            else
               
            { 
                tail.next=temp;
                tail=temp;
                  System.out.println("tail is"+tail.val);
                
            }
           // 
            temp=temp.next;
        }
        
        node.next=tail1.next;
        tail.next=null;
    //    System.out.println("tail1 is :"+tail1.next.val);
        return node1.next;
        
    }
}