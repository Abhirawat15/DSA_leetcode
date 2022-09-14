/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        int count1=0;
        while(temp1!=null){
            count1++;
            temp1=temp1.next;
        }
        
        ListNode temp2=headB;
        int count2=0;
        while(temp2!=null){
            count2++;
            temp2=temp2.next;
        }
        
        int diff=Math.abs(count1-count2);
        if(count1>count2){
            for(int i=1;i<=diff;i++){
                headA=headA.next;
            }
        }else{
            for(int i=1;i<=diff;i++){
                headB=headB.next;
            }
        }
        
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        if(headA==headB){
            return headA;
        }else{
            return null;
        }
    }
}