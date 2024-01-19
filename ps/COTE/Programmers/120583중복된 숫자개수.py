def solution(array, n):
    answer = 0
    for i in array:
        if(i == n):
            answer +=1
        else:
            continue
    return answer


"""
배열인자와 주어진 정수를 하나씩 비교하여 같을 때 마다 answer+=1을하고 answer를 반환

"""