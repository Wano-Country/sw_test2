import sys
sys.setrecursionlimit(100000)

def binarySearch(array, target, left, right):
    middle_idx = (left+right)//2
    print(middle_idx)
    middle = array[middle_idx]
    if target == middle:
        print('answer {}'.format(middle_idx))
    elif middle > target:
        binarySearch(array, target,left,middle_idx-1)
    elif middle < target:
        binarySearch(array, target,middle_idx+1,right)
    else: 
        return False

target = 29
m_list = [30, 94, 27, 92, 21, 37, 25, 47, 25, 53, 98, 19, 32, 32, 7]
length = len(m_list)

m_list.sort()
left = 0 
right = length-1

binarySearch(m_list,target,0,right)