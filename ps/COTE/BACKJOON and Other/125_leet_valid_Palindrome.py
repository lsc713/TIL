class Solution(object):

    def isPalindrome(self, s):
        arr = []
        for i in s:
            if i.isalnum():
                arr.append(i.lower())
        for i in range((len(arr) // 2)):
            if arr[i] != arr[-(i+1)]:
                return False
        return True

sol = Solution()
result = sol.isPalindrome("A man, a plan, a canal: Panama")
print(result)

