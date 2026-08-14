class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rowseen = [[False] * 9 for _ in range(9)]
        colseen = [[False] * 9 for _ in range(9)]
        boxseen = [[False] * 9 for _ in range(9)]

        for r in range(9):
            for c in range(9):
                cell_value = board[r][c]

                if cell_value == ".":
                    continue
                digit_index = int(cell_value) - 1
                box_index = (r // 3) * 3 + (c // 3)

                if rowseen[r][digit_index] or colseen[c][digit_index] or boxseen[box_index][digit_index]:
                    return False

                rowseen[r][digit_index] = True
                colseen[c][digit_index] = True
                boxseen[box_index][digit_index] = True
            
        return True


