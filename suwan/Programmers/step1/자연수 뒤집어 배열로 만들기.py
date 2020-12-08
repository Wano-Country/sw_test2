def solution(n):
    return [int(i) for i in str(n)[::-1]]


n1 = 12345  # return [5,4,3,2,1]

print(solution(n1))
