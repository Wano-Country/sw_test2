
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
n_dic = {}
for n in n_num:
    start = 0
    end = len(n_num) - 1
    if n not in n_dic:
        n_dic[n] = binarySearch(n_num, n, start, end)

print(' '.join(str(n_dic[x]) if x in n_dic else '0' for x in m_num))
'''
바로 출력하면 시간초과뜨고
딕셔너리쓰면 시간초과 안뜨는 이유는 ?
'''

# binary search application.
