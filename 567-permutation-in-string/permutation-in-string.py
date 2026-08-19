class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        s1_sorted = sorted(s1)

        start = 0
        

        for i in range(len(s2)):
            end = i + len(s1)
            temp_window = s2[i:end]
            if s1_sorted == sorted(temp_window):
                return True
        
        return False