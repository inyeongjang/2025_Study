import sys 
input = sys.stdin.readline

N = int(input().strip())
A = list(map(int, input().split()))

M = int(input().strip())
B = list(map(int, input().split()))

S = set(A)
for x in B:
    if x in S:
        print(1)
    else:
        print(0)