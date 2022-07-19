from bisect import bisect_left
class Solution:
    def constructLowerArray(self, arr, n):
        counts = []
        new_arr = sorted(arr)
        for num in arr:
            counts.append(bisect_left(new_arr, num))
            new_arr.pop(counts[-1])
        return counts
