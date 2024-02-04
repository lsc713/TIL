import heapq

def solution(food_times, k):
    if sum(food_times) <= k:  # 음식 먹는 데 걸리는 시간이 k보다 작거나 같다면 -1
        return -1

    q = []  # 우선순위 큐
    for i in range(len(food_times)):  # 우선순위 큐(최소 힙) 생성
        heapq.heappush(q, (food_times[i], i + 1))  # 음식 시간과 음식 번호를 넣어준다

    length = len(food_times)
    prev = 0

    while True:
        # q[0][0] : 힙의 가장 상단 부분으로 음식 시간이 제일 적은 것이 해당된다.
        if k > (q[0][0] - prev) * length:  # k보다 가장 적게 걸리는 음식 * 남은 음식 수가 작은 경우,
            k -= (q[0][0] - prev) * length  # 가장 적게 걸리는 음식을 다 먹을 때까지 소요된 시간을 빼준다.
            length -= 1
            prev, _ = heapq.heappop(q)
        else:
            i = k % length
            q.sort(key=lambda x: x[1])
            return q[i][1]

solution([3,1,2],5)