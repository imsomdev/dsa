"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':

        if head is None:
            return None

        curr = head

        new = Node(curr.val)
        new_head = new

        old_to_new = {curr: new}
        new_to_old = {new: curr}

        while curr.next:
            new.next = Node(curr.next.val)

            old_to_new[curr.next] = new.next
            new_to_old[new.next] = curr.next

            new = new.next
            curr = curr.next

        new.next = None
        new = new_head

        while new:
            old_node = new_to_old[new]
            old_random = old_node.random

            if old_random is None:
                new.random = None
            else:
                new_random = old_to_new[old_random]
                new.random = new_random

            new = new.next

        return new_head