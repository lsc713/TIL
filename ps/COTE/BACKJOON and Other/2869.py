import math

a,b,v= list(map(int,input().split()))

count =  1

count = (v-b)/(a-b)
print(math.ceil(count))


# ax - b(x-1) = v
# ax - bx +b = v
# x(a-b) + b = v
# x= v - b / a - b
