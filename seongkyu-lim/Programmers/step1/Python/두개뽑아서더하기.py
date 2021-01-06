def solution(numbers):
    answer = []
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            new_num = numbers[i]+numbers[j]
            answer.append(new_num)
    answer = set(answer)
    answer = list(answer)
    answer.sort()
    return answer
