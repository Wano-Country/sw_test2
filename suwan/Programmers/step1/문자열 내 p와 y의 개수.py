def solution(s):
    s = list(s.lower())
    return s.count('p') == s.count('y')


s1 = "pPoooyY"  # return true
s2 = "Pyy"  # return False

print(solution(s1))
print(solution(s2))
