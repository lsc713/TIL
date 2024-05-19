def solution(progresses, speeds):
    answer = []
    
    idx=0
    while True:
        for i in range(len(progresses)):
            progresses[i]+=speeds[i]
        cnt=0
        for i in range(idx,len(progresses)):
            if progresses[i]>=100:
                cnt+=1
            else:
                break
        if cnt>0:
            answer.append(cnt)
            idx+=cnt
        if sum(answer)==len(progresses):
            return answer
    
            
