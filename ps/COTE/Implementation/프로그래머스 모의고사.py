def solution(answers):
    answer = []
    a1=[1,2,3,4,5]
    a2=[2,1,2,3,2,4,2,5]
    a3=[3,3,1,1,2,2,4,4,5,5]

    c1=0
    c2=0
    c3=0
    for i in answer:
        i == a1[i]
        c1+=1
        i == a2[i]
        c2+=1
        i == a3[i]
        c3+=1
    answer = answer.append(max(c1,c2,c3))
    return answer

solution([1,2,3,4,5])