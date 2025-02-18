import math

class Solution(object):
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """

        hs = set()

        while(True):
            digits = self.getDigits(n)
            sum = 0
            for i in digits:
                sum += i*i

            if sum == 1:
                return True
            
            b = sum in hs
            if b == True:
                return False
            else:
                hs.add(sum)

            n = sum


        return True
    

    def getDigits(self, n):
        i = 1
        res = []
        while n > 0 :
            digit = n % 10
            res.append(digit)
            n = math.floor(n/10)
            

        return res


sol = Solution()
print(sol.isHappy(19))