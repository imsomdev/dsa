class Solution:
    def dailyTemperatures(self, temperatures: list[int]) -> list[int]:
        n = len(temperatures)
        res = [0] * n
        st = []
        
        for i, temp in enumerate(temperatures):
            while st and temp > temperatures[st[-1]]:
                prev_index = st.pop()
                res[prev_index] = i - prev_index
            st.append(i)
            
        return res