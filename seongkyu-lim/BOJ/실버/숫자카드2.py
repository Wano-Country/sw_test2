
from sys import stdin

n = int(stdin.readline())
n_num = list(map(int, stdin.readline().split()))
m = int(stdin.readline())
m_num = list(map(int, stdin.readline().split()))


def binarySearch(arr, target, left, right):
    if left > right:
        return 0
    mid_idx = (left+right)//2
    middle = arr[mid_idx]
    if middle > target:
        return binarySearch(arr, target, left, mid_idx-1)
    elif middle == target:
        i = mid_idx + 1
        j = 1
        while i < len(arr) and arr[i] == target:
            i += 1
            j += 1
        i = mid_idx - 1
        while 0 <= i and arr[i] == target:
            i -= 1
            j += 1
        return j
    elif middle < target:
        return binarySearch(arr, target, mid_idx+1, right)


n_num.sort()
for val in m_num:
    print(binarySearch(n_num, val, 0, len(n_num)-1), end="")
    print(' ', end="")


# binary search application.
