import sys
input = sys.stdin.readline 

N, K = map(int, input().split())
arr = list(range(1, N + 1))

result = [] 
idx = 0

for _ in range(N):
    idx = (idx + K - 1) % len(arr)
    result.append(arr.pop(idx)) 

print('<' + ', '.join(map(str, result)) + '>')