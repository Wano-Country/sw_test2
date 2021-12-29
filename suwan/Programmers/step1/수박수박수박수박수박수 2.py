def solution(n):
    a, b = divmod(n, 2)
    return "수박" * a + "수" * b


n1 = 3  # return "수박수"
n2 = 4  # return "수박수박"
print(solution(n1))
print(solution(n2))
