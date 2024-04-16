n=int(input())
arr=[]
for i in range(n):
    arr.append(int(input()))
sum=0    
for i in range(n-2,-1,-1):
    if arr[i]>=arr[i+1]:
        sum+=arr[i]-arr[i+1]+1
        arr[i]=arr[i+1]-1
print(sum)        
        