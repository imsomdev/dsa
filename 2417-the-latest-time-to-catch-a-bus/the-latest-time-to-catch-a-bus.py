class Solution(object):
    def latestTimeCatchTheBus(self, buses, passengers, capacity):
        """
        :type buses: List[int]
        :type passengers: List[int]
        :type capacity: int
        :rtype: int
        """
        buses.sort()
        passengers.sort()
        
        p = 0
        m = len(passengers)
        
        for bus in buses:
            count = 0
            while count < capacity and p < m and passengers[p] <= bus:
                p += 1
                count += 1
        
        if count < capacity:
            best_time = buses[-1]
        else:
            best_time = passengers[p - 1]
            
        passenger_set = set(passengers)
        while best_time in passenger_set:
            best_time -= 1
            
        return best_time