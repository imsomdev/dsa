# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(
        self,
        l1: ListNode | None,
        l2: ListNode | None
    ) -> ListNode | None:

        carry = 0

        dummy = ListNode()
        curr = dummy

        while l1 or l2:
            total = 0

            if l1 is None:
                total = l2.val + carry
                l2 = l2.next

            elif l2 is None:
                total = l1.val + carry
                l1 = l1.next

            else:
                total = l1.val + l2.val + carry
                l1 = l1.next
                l2 = l2.next

            digit = total % 10
            carry = total // 10

            curr.next = ListNode(digit)
            curr = curr.next

        if carry:
            curr.next = ListNode(carry)

        return dummy.next