def solution(d, budget):
    answer = 0
    d.sort()
    for i in d:
        budget -= i
        if budget < 0:
            return answer
        answer += 1
    return answer


d1 = [1, 3, 2, 5, 4]
budget1 = 9  # return 3
d2 = [2, 2, 3, 3]
budget2 = 10  # return 4

print(solution(d1, budget1))
print(solution(d2, budget2))
