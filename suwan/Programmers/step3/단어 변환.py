def find_one_diff(a_word, b_word):
    cnt = 0
    for (a,b) in zip (a_word, b_word):
        if a == b:
            cnt += 1
    return cnt
def solution(begin, target, words):
    if target not in words:
        return 0
    answer = 0
    while True:
        candidate_num = []
        for word in words:
            diff_num = find_one_diff(word, begin)
            if diff_num == -1:
                return answer
            if diff_num == len(word) -1:
                candidate_num.append(word)
        if target in candidate_num:
            answer += 1
            return answer
        for can in candidate_num:
            begin = can
            words.remove(can)
            answer += 1
    return answer