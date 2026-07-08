public class Solution {
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode first = head;
        ListNode second = head;

        while (second != null && second.next != null) {

            first = first.next;
            second = second.next.next;

            if (first == second) {
                return true;
            }
        }

        return false;
    }
}