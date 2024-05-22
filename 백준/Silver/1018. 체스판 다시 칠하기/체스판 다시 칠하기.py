import sys
input=sys.stdin.readline
def chess(graph,start_row,start_col):
  count1,count2=0,0
  pattern1=[
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB"
  ]
  pattern2=[
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW"
  ]
  for i in range(8):
    for j in range(8):
      if graph[start_row+i][start_col+j] != pattern1[i][j]:
        count1+=1
      if graph[start_row+i][start_col+j] != pattern2[i][j]:
        count2+=1
  return min(count1,count2)
def mincolor(graph,n,m):
  inf=1e9
  for i in range(n-7):
    for j in range(m-7):
      if inf >chess(graph,i,j) :
        inf = chess(graph,i,j)
  return inf

n,m=map(int,input().split())
graph=[(input().strip()) for _ in range(n)]
answer=mincolor(graph,n,m)
print(answer)