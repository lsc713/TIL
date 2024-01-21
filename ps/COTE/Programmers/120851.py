def solution(my_string):
    array = []
    for i in my_string:
        if(i.isdigit()):
            array.append(int(i))
    return sum(array)

"""
문자열에 대하여 하나의 인자마다 숫자인지판별하여
숫자라면 리시트에 숫자형으로 더하고
마지막엔 그 배열을 더해서 반환

"""