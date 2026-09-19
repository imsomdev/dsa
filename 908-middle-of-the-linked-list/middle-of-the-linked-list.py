# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: ListNode | None) -> ListNode | None:
        fast = slow = head

        while fast:
            if fast.next is None:
                break
            slow = slow.next
            fast = fast.next.next
        
        return slow