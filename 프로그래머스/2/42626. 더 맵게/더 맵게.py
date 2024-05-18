import heapq
def solution(scoville, K):
    answer = 0
    heap = []
    for i in scoville:
        heapq.heappush(heap,i)
    while heap[0]<K:
        if len(heap)<2:
            if heap[0]<K:
                return -1
                break
        firstmin = heap[0]
        heapq.heappop(heap)
        secondmin = heap[0]
        heapq.heappop(heap)
        heapq.heappush(heap,firstmin+(secondmin*2))
        answer+=1
    return answer