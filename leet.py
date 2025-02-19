import math

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        l = len(nums)
        i = 1

        while(i < l):
            if nums[i] != nums[i-1]:
                i = i + 1
            else:
                nums.pop(i)
                l = l - 1



sol = Solution()
arr = [0,0,1,1,1,2,2,3,3,4]
sol.removeDuplicates(arr)
print(arr)