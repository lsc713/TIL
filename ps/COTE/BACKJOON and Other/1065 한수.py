n=int(input())
count = 0

def hansu(i):
    arr = list(map(int, str(i)))
    if(len(arr)<3):
        return True
    diff = arr[1]-arr[0]
    for i in range(2,len(arr)):
        if arr[i]-arr[i-1] != diff:
            return False
    return True

for i in range(1,n+1):
    if hansu(i):
        count+=1

print(count)