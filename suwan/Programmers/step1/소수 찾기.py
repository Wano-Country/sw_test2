import math


def solution(n):
    lists = [True for _ in range(n + 1)]
    for i in range(2, int(math.sqrt(n)) + 1):
        j = 2
        while i * j <= n:
            lists[i * j] = False
            j += 1
    answer = [i for i in range(2, n + 1) if lists[i]]
    return len(answer)


n1 = 10  # return 4
n2 = 5  # return 3

print(solution(n1))
print(solution(n2))
