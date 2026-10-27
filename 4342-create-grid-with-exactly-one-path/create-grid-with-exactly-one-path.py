class Solution:
    def createGrid(self, m: int, n: int) -> list[str]:
        res = []

        for i in range(m):
            row = ""
            for j in range(n):
                if i == 0 or j == n - 1:
                    row += "."
                else:
                    row += "#"
            res.append(row)

        return res