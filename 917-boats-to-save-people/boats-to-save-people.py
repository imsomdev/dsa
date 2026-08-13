class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        h = len(people) - 1 #heaviest
        l = 0 # lightest
        res = 0
        while l <= h:
            total_weight = people[l] + people[h]

            if total_weight <= limit:
                res += 1
                l += 1
                h -= 1
            elif people[h] <= limit:
                res += 1
                h -= 1
            else:
                h -= 1
        
        return res


                
                


