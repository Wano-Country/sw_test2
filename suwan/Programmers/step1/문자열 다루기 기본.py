def solution(s):
    return len(s) in (4, 6) and s.isdigit()


s1 = 'a234'  # return false
s2 = '1234'  # return true

print(solution(s1))
print(solution(s2))
