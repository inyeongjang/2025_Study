import sys
input = sys.stdin.readline

N = int(input())
N_list = list(map(int, input().split()))

count_dict = {}

# n이 처음 나오면 0, 이미 있으면 기존 개수 +1 
for n in N_list:
    count_dict[n] = count_dict.get(n, 0) + 1

M = int(input())
M_list = list(map(int, input().split()))

# m이 count_dict에 있으면 개수 출력, 없으면 0 출력
for m in M_list:
    print(count_dict.get(m, 0), end = ' ')