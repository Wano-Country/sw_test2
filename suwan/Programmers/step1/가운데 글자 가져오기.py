def solution(s):
    if len(s) % 2 == 0:
        return s[len(s) // 2 - 1:len(s) // 2 + 1]
    return s[len(s) // 2]


s1 = 'abcde'  # return 'c'
s2 = 'qwer'  # return 'we'

print(solution(s1))
print(solution(s2))
