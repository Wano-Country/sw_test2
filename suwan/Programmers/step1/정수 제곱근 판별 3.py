def solution(n):
    sqrt = n ** (1 / 2)
    if sqrt % 1 == 0:
        return (sqrt + 1) ** 2
    return -1


n1 = 121  # return 144
n2 = 3  # return -1

print(solution(n1))
print(solution(n2))
