import sys 
N = int(sys.stdin.readline().strip())
cnt = 0 
while (N > 0):
    N //= 5 
    cnt += N 
print(cnt) 