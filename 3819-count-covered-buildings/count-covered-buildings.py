class Solution:
    def countCoveredBuildings(self, n: int, buildings: List[List[int]]) -> int:
        # 1. Map boundaries
        min_col_in_row = {} 
        max_col_in_row = {} 
        min_row_in_col = {} 
        max_row_in_col = {} 

        for x, y in buildings:
            min_col_in_row[x] = min(min_col_in_row.get(x, float('inf')), y)
            max_col_in_row[x] = max(max_col_in_row.get(x, float('-inf')), y)
            
            min_row_in_col[y] = min(min_row_in_col.get(y, float('inf')), x)
            max_row_in_col[y] = max(max_row_in_col.get(y, float('-inf')), x)

        count = 0
        for x, y in buildings:
            row_covered = min_col_in_row[x] < y < max_col_in_row[x]
            col_covered = min_row_in_col[y] < x < max_row_in_col[y]
            if row_covered and col_covered:
                count += 1
                
        return count