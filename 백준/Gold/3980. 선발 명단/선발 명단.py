T= int(input())
def bt(cnt,sum):
    global result
    if cnt == 11:
        result = max(result, sum)
        return
    for i in range(11):
        if members[i] or not arr[cnt][i]:
            continue
        members[i]=1
        bt(cnt+1,sum+arr[cnt][i])
        members[i]=0
for _ in range(T):
    arr=[list(map(int,input().split())) for _ in range(11)]
    members = [0 for _ in range(11)]
    result = 0
    bt(0,0)
    print(result)