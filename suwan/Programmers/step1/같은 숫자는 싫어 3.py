def solution(arr):
    answer = []
    for i in range(len(arr)-1):
        if arr[i] != arr[i+1]:
            answer.append(arr[i])
    answer.append(arr[-1])
    return answer


arr1 = [1, 1, 3, 3, 0, 1, 1]  # return [1,3,0,1]
arr2 = [4, 4, 4, 3, 3]  # return [4,3]

print(solution(arr1))
print(solution(arr2))