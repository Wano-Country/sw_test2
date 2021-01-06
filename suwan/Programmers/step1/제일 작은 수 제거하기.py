def solution(arr):
    arr.remove(min(arr))
    return arr if arr else [-1]


arr1 = [4, 3, 2, 1]  # return [4,3,2]
arr2 = [10]  # return [-1]

print(solution(arr1))
print(solution(arr2))
