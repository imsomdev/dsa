class Solution:
    def reverseBetween(self, head: ListNode | None, left: int, right: int) -> ListNode | None:
        if not head or left == right:
            return head

        dummy = ListNode(0, head)
        before_left = dummy

        # Move before_left to the node just before `left`
        for _ in range(left - 1):
            before_left = before_left.next

        # Reverse the sublist from left to right
        prev = None
        curr = before_left.next

        for _ in range(right - left + 1):
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        # Reconnect
        left_node = before_left.next
        before_left.next = prev
        left_node.next = curr

        return dummy.next