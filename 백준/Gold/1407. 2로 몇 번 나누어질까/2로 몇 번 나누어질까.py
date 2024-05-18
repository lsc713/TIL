a,b=map(int,input().split())
a-=1
tmp_a=a
tmp_b=b
for i in range(1,50):
    tmp_a+=(a//(2**i))*(2**i - 2**(i-1))
    tmp_b+=(b//(2**i))*(2**i - 2**(i-1))
print(tmp_b-tmp_a)    