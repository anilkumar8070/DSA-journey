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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
                return head;
            }
        
        ListNode temp = head;
            
            
            int length = 0;
            while(temp!=null){
                temp = temp.next;
                length++;
            }

            k = k % length;
            if(k == 0){
                return head;
            }
        
        while(k>0){
            ListNode current = head;
            ListNode prev = null;

            if(head==null || head.next==null){
                return head;
            }

            while(current.next!=null){
                prev = current;
                current = current.next;
            }
            current.next = head;
            prev.next = null;
            head = current;
        

            k--;
        }

        return head;
    }
}