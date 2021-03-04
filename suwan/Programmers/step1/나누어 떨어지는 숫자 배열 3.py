def solution(arr, divisor):
    return sorted([i for i in arr if not (i % divisor)]) or [-1]


arr1 = [5, 9, 7, 10]
divisor1 = 5  # return [5,10]

arr2 = [2, 36, 1, 3]
divisor2 = 1  # return [1,2,3,36]

arr3 = [3, 2, 6]
divisor3 = 10  # return [-1]

print(solution(arr1, divisor1))
print(solution(arr2, divisor2))
print(solution(arr3, divisor3))
