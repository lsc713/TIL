def solution(n):
    answer = 0
    for i in str(n):
        answer+=int(i)
    return answer

"""
정수를 숫자화 하여 반복문에 집어넣고 각 문자하나하나를 다시 숫자로 만들어서 
answer에 넣어 반환
"""