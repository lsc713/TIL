def solution(clothes):
    type={}
    for i in range(len(clothes)):
        if clothes[i][1] in type:
            type[clothes[i][1]]+=1
        else:
            type[clothes[i][1]]=1
    answer = 1
    for i in type.values():
        answer*=i+1
    return answer-1