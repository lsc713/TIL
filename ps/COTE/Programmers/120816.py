def solution(slice, n):
    answer = 0
    answer +=n//slice
    if(n%slice >0):
        answer+=1
    return answer

"""
문제의 요구는 피자 몇판이 필요한가이다.
n//slice == 판수가 출력되나 

한조각이상 먹을 수 없는 인원(소수가 남는다면)이 있다면 한판 더시켜야함
"""