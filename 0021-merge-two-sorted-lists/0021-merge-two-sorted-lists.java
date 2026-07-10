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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }else if(l2==null){
            return l1;
        }
        ListNode temp = new ListNode(-1);
        ListNode head = temp;
        while(l1!=null && l2!=null){
            if(l2.val<=l1.val){
            temp.next = l2;
            temp = l2;
                l2 = l2.next;
            }else{
                temp.next= l1;
                temp = l1;
                l1 = l1.next;
            }
        }
        while(l1!=null){
            temp.next= l1;
                temp = l1;
                l1 = l1.next;
        }
        while(l2!=null){
            temp.next = l2;
            temp = l2;
                l2 = l2.next;
        }

        return head.next;
        
    }
}