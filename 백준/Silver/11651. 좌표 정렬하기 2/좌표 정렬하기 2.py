import sys
input = sys.stdin.readline

N = int(input())
coord = []

for _ in range(N):
    x, y = map(int, input().split())
    coord.append((y, x))

coord.sort()

for i in range(N):
    print(coord[i][1], coord[i][0])