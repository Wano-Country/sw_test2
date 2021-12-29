def solution(strings, n):
    return sorted(sorted(strings), key=lambda x: x[n])



strings1 = ['sun', 'bed', 'car']
n1 = 1  # return ['car', 'bed', 'sun']

strings2 = ['abce', 'abcd', 'cdx']
n2 = 2  # return ['abcd', 'abce', 'cdx']

print(solution(strings1, n1))
print(solution(strings2, n2))