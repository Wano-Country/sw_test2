def solution(a, b):
    return sum([i for i in range(a, b + 1)]) \
           or \
           sum([i for i in range(b, a + 1)])


a1 = 3
b1 = 5  # return 12

a2 = 3
b2 = 3  # return 3

a3 = 5
b3 = 3  # return 12
print(solution(a1, b1))
print(solution(a2, b2))
print(solution(a3, b3))
