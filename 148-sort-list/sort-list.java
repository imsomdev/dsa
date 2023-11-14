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

    ListNode mergeList(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while (first != null && second != null) {
            if (first.val <= second.val) {
                temp.next = first;
                first = first.next;
            } else {
                temp.next = second;
                second = second.next;
            }
            temp = temp.next;
        }
        if (first != null) {
            temp.next = first;
        } else if (second != null) {
            temp.next = second;
        }
        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = null;

        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return mergeList(l1, l2);
    }
}
