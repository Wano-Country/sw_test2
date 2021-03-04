def solution(n):
    # answer = 0
    return int(''.join(sorted(str(n), reverse=True)))


n1 = 118372  # return 873211

print(solution(n1))