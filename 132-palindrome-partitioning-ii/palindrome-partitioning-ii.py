class Solution(object):
    def minCut(self, s):
        n = len(s)
        
        is_pal = [[False] * n for _ in range(n)]
        for i in range(n):
            is_pal[i][i] = True
        for i in range(n - 1):
            is_pal[i][i + 1] = (s[i] == s[i + 1])
        for length in range(3, n + 1):
            for i in range(n - length + 1):
                j = i + length - 1
                is_pal[i][j] = (s[i] == s[j] and is_pal[i + 1][j - 1])
        
        self.dp = [[-1] * n for _ in range(n)]
        self.is_pal = is_pal
        return self.solve(s, 0, n - 1)
    
    def solve(self, s, i, j):
        if i >= j:
            return 0
        if self.is_pal[i][j]:
            return 0
        if self.dp[i][j] != -1:
            return self.dp[i][j]
        
        res = float("inf")
        for k in range(i, j):
            if self.is_pal[i][k]:
                res = min(res, 1 + self.solve(s, k + 1, j))
        
        self.dp[i][j] = res
        return res