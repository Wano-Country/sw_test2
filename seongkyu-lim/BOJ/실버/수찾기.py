
import sys
sys.setrecursionlimit(100000)

n = int(sys.stdin.readline())

num = sys.stdin.readline()
num_list = num.split(' ')

m = int(sys.stdin.readline())
find_num = sys.stdin.readline()
find_numlist = find_num.split(' ') 

num_list = list(map(int, num_list))
find_numlist = list(map(int, find_numlist))

num_list.sort()
#이진탐색을 위해 우선 리스트 정렬

        
def binary_search_recursion(target, start, end, data):
    if start > end:
        return None
    mid = (start + end) // 2
    if data[mid] == target:
        return mid
    elif data[mid] > target:
        end = mid - 1
    elif data[mid] < target:
        start = mid + 1        
    return binary_search_recursion(target, start, end, data)

for value in find_numlist :    
    if binary_search_recursion(value, 0, len(num_list)-1, num_list) == None :
        print(0)
    else :
        print(1)
        
        
# 타임에러
# 이진탐색