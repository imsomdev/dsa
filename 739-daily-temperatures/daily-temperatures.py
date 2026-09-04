class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n = len(temperatures)
        res = [0] * n
        st = []

        for i, temp in enumerate(temperatures):
            while st and temp > st[-1][0]:
                top = st.pop()
                res[top[1]] = i - top[1]

            st.append((temp, i))

        return res
