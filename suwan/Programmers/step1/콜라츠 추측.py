def solution(n):
    for i in range(500):
        if n == 1:
            return i
        if n % 2 == 0:
            n /= 2
        else:
            n = n * 3 + 1
    return -1


n1 = 6  # return 8
n2 = 16  # return 4
n3 = 626331  # return -1

print(solution(n1))
print(solution(n2))
print(solution(n3))
