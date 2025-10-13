import sys 
input = sys.stdin.readline
N = int(input())

factorial = 1 
for i in range(2, N + 1): 
    factorial *= i 

count = 0 
while True:
    if (factorial % 10 == 0) :
        count += 1 
    else:
        break 
    factorial //= 10 
print(count) 