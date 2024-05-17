n=int(input())
a,b,c=0,0,0
count=0
for i in range(1,n):
    for j in range(1,n):
        for k in range(1,n):
            if i+j+k==n:
                if k >=j+2:
                    if i % 2 ==0:
                        count+=1

print(count)