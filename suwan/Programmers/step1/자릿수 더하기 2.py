def solution(N):
    return sum([int(i) for i in str(N)])


N1 = 123  # return 6
N2 = 987  # return 24

print(solution(N1))
print(solution(N2))
