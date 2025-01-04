class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        res: int = 0
        for c in operations:
            if c == "X--" or c == "--X":
                res -= 1
            else:
                res += 1
        return res