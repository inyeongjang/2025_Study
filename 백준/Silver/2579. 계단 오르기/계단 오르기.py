N = int(input())

score = [0] * (N + 1)

for i in range(1, N + 1):
    score[i] = int(input())

if N == 1:
    print(score[1])
    exit()
    
elif N == 2:
    print(score[1] + score[2])
    exit()

dp = [0] * (N + 1)

dp[1] = score[1]
dp[2] = score[1] + score[2]
dp[3] = max(score[1] + score[3], score[2] + score[3])

for j in range(4, N + 1):
    dp[j] = max(dp[j-2] + score[j], dp[j-3] + score[j-1] + score[j])

print(dp[N])