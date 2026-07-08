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
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode temp = new ListNode(-1);
        ListNode A = temp;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode Head = new ListNode();
        int carry = 0;
        while(p1!=null && p2!=null){
            int sum = p1.val + p2.val + carry;
            carry = sum/10;
            ListNode lst = new ListNode(sum%10);
            temp.next = lst;
            temp = temp.next;
            if(p1!=null)p1=p1.next;
            if(p2!=null)p2=p2.next;
        }
        while(p1!=null){
            int sum = p1.val + carry;
            carry = sum / 10;
            p1.val = sum % 10;
            temp.next = p1;
            temp = temp.next;
            p1 = p1.next;
        }
        while(p2!=null){
            int sum = p2.val + carry;
            carry = sum / 10;
            p2.val = sum % 10;
            temp.next = p2;
            temp = temp.next;
            p2 = p2.next;
        }
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }       

        return A.next;
    }
}