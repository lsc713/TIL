def solution(N, stages):
    # # arr = []
    # # arr =( [0] * N for _ in range(N))
    #
    # # fail = 도달한 사람 중 클리어 못한사람 / 도달한사람
    # # fail = didn't clear/ stage
    # stage = 0
    # dclear = 0
    # total = []
    # total = ([0] * 1 for _ in range(N))
    # answer = []
    #
    #
    # for i in range(N): # 0,1,2,3,4
    #     for j in range(N):
    #         if( stages[j] > i ): # 각 원소 마다 i의 숫자를 확인함 0으로 가정하면 다 높다. 그렇다는건 클경있음을 의미 / 도달도 했음.
    #             dclear += 1
    #             stage += 1
    #         else:
    #             # 쭉 돌다가, i가 3가되고 j가 3인경우에는
    #             dclear +=0
    #             stage += 1
    #
    #
    #
    # total   # 각 스테이지의 실패율을 알 수 있는데, 도달한 사람 없음 0
    #
    # for i in range(N):
    answer = []
    ratio = {} # dictionary 를 통해 key value 를 저장할 수 있음 (여기서는 각 스테이지 당 실패율의 저장)

    player = len(stages) #첨엔 스테이지의 모든인원이 참여
    for i in range(1,N+1): #각 스테이지에 대하여 진행
        if player == 0:
            ratio[i] = 0
        else:
            ratio[i] = stages.count(i)/player # 도달 후 머문사람(스테이지배열에 숫자에 해당하는 사람) / 도달한 사람
            player -= stages.count(i) #상위 스테이지로 가지 못한 사람

    answer = sorted(ratio,key=lambda x:ratio[x], reverse= True) #실패율에 대한 정렬을 키 값으로 반환
    return answer


