def solution(s):
    answer = ''
    s = s.lower().split(" ")
    print(s)
    for l in s:
        answer += ''.join([i.upper() if index % 2 == 0 else i for index, i in enumerate(l)])
        answer += ' '

    return answer[: -1]


s1 = "try hello world"  # return "Try HeLlo WoRlD"

print(solution(s1))
