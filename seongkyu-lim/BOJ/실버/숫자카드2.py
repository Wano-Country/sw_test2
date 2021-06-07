import sys
sys.setrecursionlimit(10**7)
n = int(input())
n_num = list(map(int, input().split()))
m = int(input())
m_num = list(map(int, input().split()))


def binarySearch(list, target, left, right):
    if left > right:
        return 0
    mid_idx = (left+right)//2
    middle = list[mid_idx]
    if middle > target:
        binarySearch(list, target, left, middle-1)
    elif middle == target:
        return list[left:right+1].count(target)
    elif middle < target:
        binarySearch(list, target, middle+1, right)


n_num.sort()
for val in m_num:
    print(binarySearch(n_num, val, 0, len(n_num)), end="")
    print(' ', end="")


# n_num.count() -> 탐색 알고리즘으로 바꾸기.
