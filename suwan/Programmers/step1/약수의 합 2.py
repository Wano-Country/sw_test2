def solution(n):
    return n + sum([i for i in range(1, n // 2 + 1) if n % i == 0])


n1 = 12  # return 28
n2 = 5  # return 6
print(solution(n1))
print(solution(n2))
