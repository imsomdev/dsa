class Solution:
    def minimumRefill(self, plants: List[int], capacityA: int, capacityB: int) -> int:
        res = 0
        n = len(plants) - 1
        l = 0
        r = n
        in_cap_A = capacityA
        in_cap_B = capacityB

        while l <=r :
            if l==r:
                if capacityA >= plants[l] or capacityB >= plants[l]:
                    break
                else:
                    res += 1
                    
            else:
                if plants[l] <= capacityA:
                    capacityA -= plants[l]
                else:
                    capacityA = in_cap_A
                    res += 1
                    capacityA -= plants[l]
                
                if plants[r] <= capacityB:
                    capacityB -= plants[r]
                else:
                    capacityB = in_cap_B
                    res += 1
                    capacityB -= plants[r]
            
            l += 1
            r -= 1
        
        return res
    
            

            