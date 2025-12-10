class Solution(object):
    def solve(self, w1, w2, i, j, dp):
        if i < 0:
            return j + 1
        if j < 0:
            return i + 1
        
        if dp[i][j] != -1:
            return dp[i][j]

        if w1[i] == w2[j]:
            dp[i][j] = self.solve(w1, w2, i-1, j-1, dp)
        else:
            insert_op  = self.solve(w1, w2, i, j-1, dp)     # Insert
            delete_op  = self.solve(w1, w2, i-1, j, dp)     # Delete
            replace_op = self.solve(w1, w2, i-1, j-1, dp)   # Replace
            dp[i][j] = 1 + min(insert_op, delete_op, replace_op)

        return dp[i][j]

    def minDistance(self, word1, word2):
        n, m = len(word1), len(word2)
        dp = [[-1] * m for _ in range(n)]
        return self.solve(word1, word2, n-1, m-1, dp)
