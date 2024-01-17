def solution(n): #n은 명수임
    answer = n%7 #피자가 7조각으로 나뉜다고함
    if(answer == 0): #나머지가 0이면 딱 맞아떨어지는거임 바로 몫 반환
        return n//7
    elif(answer < 1): #나머지가 소수다 == 1이 아니다 6명 이하의 인원이므로 한판이면 충분
        return 1
    else: # 그거아니면 8명이상인데 안나눠 떨어지는거니 몫에다가 한판 더주면 판수 맞아짐.
       return n//7+1

