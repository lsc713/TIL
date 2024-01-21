def solution(n):
    answer = 0
    for i in range(1,n+1):
        if(n%i == 0):
            answer+=1
        else:
            continue
    return answer

"""
숫자범위에 대해서 각 숫자를 해당숫자에 나누어 떨어지면 count+=1하여 최종값 반환
"""