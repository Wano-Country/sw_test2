def solution(array, command):
    return [sorted(array[com[0] - 1:com[1]])[com[2] - 1] for com in command]


array1 = [1, 5, 2, 6, 3, 7, 4]
command1 = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]  # return [4,5,3]

print(solution(array1, command1))
