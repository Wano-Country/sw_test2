def solution(n):
    if n <= 3:
        return '124'[n - 1]
    q, r = divmod(n-1, 3)
    return solution(q) + '124'[r]


n1 = 1  # return 1
n2 = 2  # return 2
n3 = 3  # return 4
n4 = 4  # return 11

print(solution(n1))
print(solution(n2))
print(solution(n3))
print(solution(n4))
