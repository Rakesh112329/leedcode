class Solution:
    def angleClock(self, hour: int, minutes: int) -> float:
        # Hour hand angle
        hour_angle = (hour % 12) * 30 + minutes * 0.5

        # Minute hand angle
        minute_angle = minutes * 6

        # Absolute difference
        diff = abs(hour_angle - minute_angle)

        # Return the smaller angle
        return min(diff, 360 - diff)