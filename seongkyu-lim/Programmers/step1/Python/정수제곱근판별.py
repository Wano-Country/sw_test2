import math


def solution(n):
    answer = 0
    n = math.sqrt(n)
    if n - int(n) == 0:
        answer = (n+1)**2
    else:
        answer = -1

    return answer
