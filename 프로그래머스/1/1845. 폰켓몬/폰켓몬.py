def solution(nums):
    answer = 0
    uniqueP=set(nums)
    maxSel =len(nums)//2
    answer = min(maxSel,len(uniqueP))
        
    return answer