from math import gcd


def solution(n, m):
    return [gcd(n, m), n * m // gcd(n, m)]


n1 = 3
m1 = 12  # return [3,12]

n2 = 2
m2 = 5  # return [1,10]

print(solution(n1, m1))
print(solution(n2, m2))
