def solution(a, b):
    return sum([i * j for i, j in zip(a, b)])


a1 = [1, 2, 3, 4]
b1 = [-3, -1, 0, 2]  # return 3

a2 = [-1, 0, 1]
b2 = [1, 0, -1]  # return -2

print(solution(a1, b1))
print(solution(a2, b2))
