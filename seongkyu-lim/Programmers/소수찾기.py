def solution(n):
    answer = 0

    for i in range(0, n):
        num = n-i
        count = 0
        for j in range(2, num):
            if num % j == 0:
                break
            else:
                count += 1
        if count == num-2:
            answer += 1
    return answer
