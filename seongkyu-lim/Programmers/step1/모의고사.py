def solution(answers):
    answer = []
    a_solved = 0
    b_solved = 0
    c_solved = 0

    for i in range(0, len(answers)):
        if answers[i] == (i+1) % 5:
            a_solved += 1

        elif (i+1) % 5 == 0:
            if answers[i] == 5:
                a_solved += 1

    for i in range(0, len(answers)):
        if i % 2 == 0:
            if answers[i] == 2:
                b_solved += 1
        else:
            if (i+1) % 8 == 2:
                if answers[i] == 1:
                    b_solved += 1
            elif (i+1) % 8 == 4:
                if answers[i] == 3:
                    b_solved += 1
            elif (i+1) % 8 == 6:
                if answers[i] == 4:
                    b_solved += 1
            elif (i+1) % 8 == 0:
                if answers[i] == 5:
                    b_solved += 1

    for i in range(0, len(answers)):
        if (i+1) % 10 == 1 or (i+1) % 10 == 2:
            if answers[i] == 3:
                c_solved += 1

        elif (i+1) % 10 == 3 or (i+1) % 10 == 4:
            if answers[i] == 1:
                c_solved += 1

        elif (i+1) % 10 == 5 or (i+1) % 10 == 6:
            if answers[i] == 2:
                c_solved += 1

        elif (i+1) % 10 == 7 or (i+1) % 10 == 8:
            if answers[i] == 4:
                c_solved += 1

        elif (i+1) % 10 == 9 or (i+1) % 10 == 0:
            if answers[i] == 5:
                c_solved += 1

    scores = [a_solved, b_solved, c_solved]

    for i, score in enumerate(scores):
        if score == max(scores):
            answer.append(i+1)

# 파이썬 내장 함수
# max - 인수로 반복가능한 자료형을 받아 그 최댓값을 돌려주는 함수.
# enumerate - 순서가 있는 자료형을 입력으로 받아 인덱스 값을 포함하는 enumerate객체 반환.

    return answer


answers = [1, 2, 3, 4, 5]
print(solution(answers))
