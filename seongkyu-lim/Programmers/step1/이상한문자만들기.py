def solution(s):
    answer = ''
    s = s.split()
    for i in range(0, len(s)):
        s_small = list(s[i])
        for j in range(0, len(s_small)):
            if j % 2 == 0:
                s_small[j] = s_small[j].upper()
            else:
                s_small[j] = s_small[j].lower()
        s[i] = ''.join(s_small)
    answer = ' '.join(s)

    return answer


s = 'Hello eVeryone'

print(solution(s))

# 공백 고려해서 고쳐야함.
