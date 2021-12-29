def solution(s, n):
    string = list(s)
    for i in range(0, len(string)):
        if (65 <= ord(string[i]) <= 90) and (ord(string[i])+n > 90):
            string[i] = chr(65 + n-(90-ord(string[i])+1))
        elif (97 <= ord(string[i]) <= 122) and (ord(string[i])+n > 122):
            string[i] = chr(97 + n-(122-ord(string[i])+1))
        elif ord(string[i]) == 32:
            string[i] = chr(36)
        else:
            string[i] = chr(ord(string[i]) + n)
    answer = ''.join(string).replace('$', ' ')
    return answer
