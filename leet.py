import math

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        s = set()
        l = len(nums)
        i = 0

        while(i < l):
            print(s)
            if nums[i] in s:
                nums.pop(i)
                i = i - 1
                l = l - 1
            else:
                s.add(nums[i])

            i = i + 1


sol = Solution()
arr = [0,0,1,1,1,2,2,3,3,4]
sol.removeDuplicates(arr)
print(arr)