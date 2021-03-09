def solution(n):
    n = str(n)
    n = list(n)
    n.sort()
    n.reverse()
    n = ''.join(n)
    n = int(n)
    answer = n
    return answer
