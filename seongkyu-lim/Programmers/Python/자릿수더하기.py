def solution(n):
    answer = 0
    n = str(n)
    n = list(n)
    for i in range(0, len(n)):
        answer += int(n[i])
    return answer
