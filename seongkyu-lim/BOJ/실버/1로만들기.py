
n = int(input())

dp = [0 for _ in range(n+1)]

for i in range(2, n+1):
    dp[i] = dp[i-1] + 1

    if i % 2 == 0 and dp[i] > dp[i//2] + 1:
        dp[i] = dp[i//2]+1

    if i % 3 == 0 and dp[i] > dp[i//3] + 1:
        dp[i] = dp[i//3] + 1

print(dp[n])

# dp의 각 배열은 인덱스 값의 1이되는 최소 연산 횟수를 의미.
# bottom to top
