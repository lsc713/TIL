def solution(my_string):
    answer = []
    for i in my_string:
        if (i.isdigit()):
            answer.append(int(i))
        answer.sort()

    return answer

"""
숨어있는문자열 덧셈과 마찬가지로

문자열 인자하나하나에 대하여 숫자인지확인 후 숫자라면 배열에 숫자형으로 더한후 마지막에 정렬 후 반환
"""