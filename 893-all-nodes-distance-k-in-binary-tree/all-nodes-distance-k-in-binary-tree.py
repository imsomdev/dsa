# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def distanceK(self, root: TreeNode, target: TreeNode, k: int) -> List[int]:
        parent = {}

        # Step 1: Build parent dictionary using DFS
        def dfs(node, par=None):
            if not node:
                return

            parent[node] = par

            dfs(node.left, node)
            dfs(node.right, node)

        dfs(root)

        # Step 2: BFS starting from target
        queue = deque([target])
        visited = {target}
        distance = 0

        while queue:
            if distance == k:
                return [node.val for node in queue]

            for _ in range(len(queue)):
                node = queue.popleft()

                # Explore left, right, and parent
                for neighbor in (node.left, node.right, parent[node]):
                    if neighbor and neighbor not in visited:
                        visited.add(neighbor)
                        queue.append(neighbor)

            distance += 1

        return []