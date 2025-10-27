class Solution(object):
    def numberOfBeams(self, bank):
        result = 0
        prev_count = 0

        for row in bank:
            curr_count = row.count("1")
            if curr_count > 0:
                result += prev_count * curr_count
                prev_count = curr_count

        return result
