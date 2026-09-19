# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: ListNode | None) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        fast = slow = head

        while fast:
            if fast.next is None:
                break
            slow = slow.next
            fast = fast.next.next

        curr = slow.next
        slow.next = None
        prev = None

        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        temp = head
        while temp and prev:
            t = temp.next
            temp.next = prev
            prev = prev.next
            temp = temp.next
            temp.next = t
            temp = temp.next
        
        return head