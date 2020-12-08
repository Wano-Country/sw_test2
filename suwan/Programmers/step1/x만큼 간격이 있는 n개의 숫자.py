def solution(x, n):
    return [x + (i * x) for i in range(n)]


x1 = 2
n1 = 5  # return [2,4,6,8,10]

x2 = 4
n2 = 3  # return [4,8,12]

x3 = -4
n3 = 2  # return [-4,-8]

print(solution(x1, n1))
print(solution(x2, n2))
print(solution(x3, n3))
