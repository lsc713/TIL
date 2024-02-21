def solution(answers):
    answer = []
    a1=[1,2,3,4,5]
    a2=[2,1,2,3,2,4,2,5]
    a3=[3,3,1,1,2,2,4,4,5,5]

    c1=0
    c2=0
    c3=0
    for i in range(len(answers)):
        if answers[i] == a1[i%5]:
            c1+=1
        if answers[i] == a2[i%8]:
            c2+=1
        if answers[i] == a3[i%10]:
            c3+=1
    value = max(c1,c2,c3)
    if c1 == value:
        answer.append(1)
    if c2 == value:
        answer.append(2)
    if c3 == value:
        answer.append(3)

    return answer