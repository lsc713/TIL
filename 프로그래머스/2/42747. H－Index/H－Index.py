def solution(citations):
    citations = sorted(citations)
    for i in range(len(citations),-1,-1):
        if citations[-i] >=i:
            return i
