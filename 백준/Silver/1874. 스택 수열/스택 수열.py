import sys 
input = sys.stdin.readline 

n = int(input())
stack = [] 
result = []
current = 1

for _ in range(n):
    target = int(input())
    
    while current <= target:
        stack.append(current)
        current += 1
        result.append('+')

    if stack[-1] == target:
        stack.pop()
        result.append('-')
    
    else:
        print("NO")
        exit()

print('\n'.join(result))