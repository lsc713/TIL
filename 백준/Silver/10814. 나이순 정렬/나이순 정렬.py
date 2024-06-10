n = int(input())
arr = []*(n)
for i in range(n):
    a,b=map(str,input().split())
    arr.append([int(a),b])
for i in sorted(arr,key=lambda x:x[0]):
    print(i[0],i[1])