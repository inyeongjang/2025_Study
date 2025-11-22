L = int(input())
S = input() 

hash_dict = {}
for i in range(26):
    hash_dict[chr(i + 97)] = i + 1 

H = 0
i = 0
for alphabet in S:
    H += hash_dict[alphabet] * 31 ** i
    i += 1

print(H % 1234567891)