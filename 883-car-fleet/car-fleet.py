class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        cars = sorted(zip(position, speed), reverse=True)

        count = 0
        fleet_time = 0

        for pos, spd in cars:
            time = (target - pos) / spd

            if time > fleet_time:
                count += 1
                fleet_time = time

        return count