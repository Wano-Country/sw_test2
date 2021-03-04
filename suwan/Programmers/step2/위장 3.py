def solution(clothes):
    answer = 1
    c = dict()
    for cloth in clothes:
        item = cloth[1]
        try:
            c[item] += 1
        except:
            c[item] = 1

    for value in c.values():
        answer *= (value+1)

    return answer-1