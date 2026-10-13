# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def rotateRight(self, head: ListNode | None, k: int) -> ListNode | None:
        if not head or not head.next or k == 0:
            return head

        def reverse(head):
            prev = None
            root = head

            while root:
                temp = root.next
                root.next = prev
                prev = root
                root = temp

            return prev

        n = 0
        root = head
        while root:
            n += 1
            root = root.next

        k = k % n

        if k == 0:
            return head

        head = reverse(head)

        root = head
        for _ in range(k - 1):
            root = root.next

        remaining = root.next
        root.next = None

        first = reverse(head)

        second = reverse(remaining)

        head.next = second

        return first


        
        
