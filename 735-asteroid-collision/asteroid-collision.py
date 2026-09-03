class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        st = []
        for i in asteroids:
            st.append(i)
            if st and i < 0:
                while len(st) > 1:
                    ele1 = st.pop()
                    ele2 = st[-1]
                    if ele2 > 0:
                        if ele2 < abs(ele1):
                            st.pop()
                            st.append(ele1)
                        elif ele2 == abs(ele1):
                            st.pop()
                            break
                        else:
                            break
                    else:
                        st.append(ele1)
                        break
        return st