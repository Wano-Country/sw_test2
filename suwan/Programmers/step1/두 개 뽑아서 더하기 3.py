def solution(numbers):
    answer = []
    for index, num1 in enumerate(numbers):
        for num2 in numbers[index+1:]:
            answer.append(num1+num2)
    return sorted(list(set(answer)))