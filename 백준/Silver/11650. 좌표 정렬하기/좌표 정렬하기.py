import sys 

N = int(sys.stdin.readline())
p_list = []

for i in range(N):
	x, y = map(int, sys.stdin.readline().split())
	p_list.append((x, y))

p_list.sort()

for x, y in p_list:
	print(x, y) 
	