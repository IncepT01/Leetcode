import math

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        if not nums:
            return 0

        j = 1

        for i in range(1, len(nums)):
            if nums[i] != nums[i-1]:
                nums[j] = nums[i]
                j = j + 1 

        return j



sol = Solution()
arr = [0,0,1,1,1,2,2,3,3,4]
sol.removeDuplicates(arr)
print(arr)