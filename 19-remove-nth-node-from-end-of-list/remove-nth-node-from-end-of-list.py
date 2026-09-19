# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head.next is None:
            return None
            
        count = 1
        cur = head
        target = None
        prev = None
        while cur:
            if count == n:
                target = head
                prev = target
            elif count > n:
                prev = target
                target = target.next
            cur = cur.next
            count += 1

        prev.next = target.next
        
        if target == head:
            return head.next
        return head
        
