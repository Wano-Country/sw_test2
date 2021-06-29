from sys import stdin
import sys
limit_number = 15000
sys.setrecursionlimit(limit_number)


def binarySearch(array, target, left, right):
    if left > right:
        return False
    middle_idx = (left+right)//2
    middle = array[middle_idx]
    if target == middle:
        return True
    elif middle > target:
        return binarySearch(array, target, left, middle_idx-1)
    elif middle < target:
        return binarySearch(array, target, middle_idx+1, right)


n, m = map(int, stdin.readline().split())

list1 = []
list2 = []
for _ in range(n):
    list1.append(stdin.readline().strip())

for _ in range(m):
    list2.append(stdin.readline().strip())

cnt = 0
list3 = []
list1.sort()
list2.sort()
for val in list1:
    if binarySearch(list2, val, 0, len(list2)-1) == True:
        cnt += 1
        list3.append(val)

print(cnt)
list3.sort()
for val in list3:
    print(val)
