num_set = set()

for i in range(10):
    N = int(input())
    num_set.add(N % 42)
     
print(len(num_set))