def solution(s):
    answer = ''
    cnt = 0
    new_word = []
    for i in range(0, len(s)):
        if s[i] != ' ':
            if cnt % 2 == 0:
                new_word.append(s[i].upper())
                cnt += 1
            else:
                new_word.append(s[i].lower())
                cnt += 1
        else:
            if cnt != 0:
                answer = answer + ''.join(new_word)
            answer += ' '
            cnt = 0
            new_word = []
            print(answer)

        if i == len(s)-1:
            answer = answer + ''.join(new_word)
    return answer


s = 'Hello  eVeryone hi'

print(solution(s))
