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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode();
        
        ListNode first=temp;
       
        int sum=0,carry=0;
        while(l1!=null || l2!=null)
        {
            ListNode temp1=new ListNode();
            if(l1!=null && l2!=null)
            {
            sum=l1.val+l2.val+carry;
            l1=l1.next;
            l2=l2.next;
            }
            else
            if(l1 ==null && l2!=null)
            {
                 sum=l2.val+carry;
                l2=l2.next;
            }
            else
            {
                 sum=l1.val+carry;
                l1=l1.next;
            }
             carry=sum/10;
              sum=sum%10;
            
            temp1.val=sum;
        
            temp.next=temp1;
            temp=temp.next;
           
        }
        
        if(carry>0)
        {
            ListNode temp1=new ListNode();
            temp1.val=carry;
            temp.next=temp1;
            
        }
       temp=first.next;
       
        return temp;
    }
}