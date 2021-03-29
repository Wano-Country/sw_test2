
import sys

n = int(sys.stdin.readline())

num = sys.stdin.readline()
num_list = num.split(' ')

m = int(sys.stdin.readline())
find_num = sys.stdin.readline()
find_numlist = find_num.split(' ') 

for value in find_numlist:
    if value in num_list :
        print(1)
    else :
        print(0)
        
# 타임에러
# 이진탐색