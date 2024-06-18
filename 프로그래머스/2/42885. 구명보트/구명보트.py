def solution(people, limit):
    answer = 0
    people = sorted(people)
    l=0
    r=len(people)-1
    while l<r:
        if people[l]+people[r]<=limit:
            l+=1
            answer+=1
        r-=1
    return len(people)-answer