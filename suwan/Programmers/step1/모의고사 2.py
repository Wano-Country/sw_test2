def solution(answers):
    w_1 = [1, 2, 3, 4, 5]
    w_2 = [2, 1, 2, 3, 2, 4, 2, 5]
    w_3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    cnt = [0, 0, 0]
    for index, a in enumerate(answers):
        index_1 = index % len(w_1)
        index_2 = index % len(w_2)
        index_3 = index % len(w_3)
        if a == w_1[index_1]:
            cnt[0] += 1
        if a == w_2[index_2]:
            cnt[1] += 1
        if a == w_3[index_3]:
            cnt[2] += 1
    max_cnt = max(cnt)
    return [index + 1 for index, i in enumerate(cnt) if max_cnt == i]


answers1 = [1, 2, 3, 4, 5]  # return [1]
answers2 = [1, 3, 2, 4, 2]  # return [1,2,3]
print(solution(answers1))
