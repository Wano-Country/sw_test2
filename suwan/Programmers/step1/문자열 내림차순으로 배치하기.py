def solution(s):
    return ''.join(sorted(s, reverse=True))


s1 = 'Zbcdefg'  # return 'gfedcbZ'

print(solution(s1))
