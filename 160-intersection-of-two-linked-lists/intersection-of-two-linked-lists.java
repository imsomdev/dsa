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
        if (headA == null || headB == null) {
            return null;
        }
        ListNode dummyA = headA;
        ListNode dummyB = headB;
        while (dummyA != null && dummyB != null) {
            if (dummyA == dummyB) {
                return dummyA;
            }
            dummyA = dummyA.next;
            dummyB = dummyB.next;

            if (dummyA == null) {
                dummyA = headB;
            } else if (dummyB == null) {
                dummyB = headA;
            }
        }
        return null;
    }
}
