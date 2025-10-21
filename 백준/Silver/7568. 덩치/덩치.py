N = int(input())
people = [] 

for i in range(N):
    x, y = map(int, input().split())
    people.append((x, y))

for (w, h) in people:
    rank = 1
    for (a, b) in people:
        if (w < a) and (h < b):
            rank += 1 
    print(rank, end = ' ')