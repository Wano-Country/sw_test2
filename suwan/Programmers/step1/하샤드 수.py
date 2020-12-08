def solution(arr):
    arr_sum = sum([int(i) for i in str(arr)])
    return arr % arr_sum == 0


arr1 = 10  # return true
arr2 = 12  # return true
arr3 = 11  # return false
arr4 = 13  # return false

print(solution(arr1))
print(solution(arr2))
print(solution(arr3))
print(solution(arr4))
