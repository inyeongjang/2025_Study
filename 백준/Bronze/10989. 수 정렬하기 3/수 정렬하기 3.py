import sys
input = sys.stdin.readline
write = sys.stdout.write

N = int(input())
cnt = [0] * 10001 

for _ in range(N):
    num = int(input())
    cnt[num]+= 1

for num in range(1, 10001):
    c = cnt[num]
    for _ in range(c):
        write(str(num) + '\n')