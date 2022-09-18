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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> al=new ArrayList<>();
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        
        // boolean flag=true;
        int ls=0;
        int rs=al.size()-1;
        while(ls<rs){
            if(al.get(ls)!=al.get(rs)){
                return false;
            }
            ls++;
            rs--;
        }
        return true;
    }
}