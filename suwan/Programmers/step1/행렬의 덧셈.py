def solution(A, B):
    answer = [[i + j for i, j in zip(a, b)] for a, b in zip(A, B)]
    return answer


arr1 = [[1, 2], [2, 3]]
arr2 = [[3, 4], [5, 6]]  # return [[4,6],[7,9]]
arr3 = [[1], [2]]
arr4 = [[3], [4]]  # return [[4],[6]]

print(solution(arr1, arr2))
print(solution(arr3, arr4))
