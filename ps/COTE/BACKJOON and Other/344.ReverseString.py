class Solution(object):
    def reverseString(self, s):
        s.reverse()
        print(s)


s=["H","a","n","n","a","h"]
result = Solution().reverseString(s)
print(result)