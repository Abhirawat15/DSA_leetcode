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
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode newNode=new ListNode(-1);
        ListNode dummy=newNode;
        int carry=0;
        int sum=0;
        while(temp1!=null && temp2!=null){
            sum=temp1.val+temp2.val+carry;
            int rem=sum%10;
            carry=sum/10;
            dummy.next=new ListNode(rem);
            dummy=dummy.next;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        
        while(temp1!=null){
            sum=temp1.val+carry;
            int rem=sum%10;
            carry=sum/10;
            dummy.next=new ListNode(rem);
            dummy=dummy.next;
            temp1=temp1.next;
        }
        
        while(temp2!=null){
            sum=temp2.val+carry;
            int rem=sum%10;
            carry=sum/10;
            dummy.next=new ListNode(rem);
            dummy=dummy.next;
            temp2=temp2.next;
        }
        
        while(carry>0){
            sum=carry;
            int rem=sum%10;
            carry=sum/10;
            dummy.next=new ListNode(rem);
        }
        
        return newNode.next;
    }
}