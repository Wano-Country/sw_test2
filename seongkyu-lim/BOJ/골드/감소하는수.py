'''
import sys
n = int(sys.stdin.readline())

a = 0
solution = 0

for i in range(n+1):
    if i < 11:
        solution = i
    else:
        right = 0
        num = str(int(solution) + 1)
        j = 0
        while right != len(num)-1:
            if num[j] > num[j+1]:
                right += 1
            else:
                num = int(num) + 1
                num = str(num)
                j = -1
            j += 1

        solution = num
print(solution)
'''
# time error


0
1
2
3
4
5
6
7
8
9
10
20
21
30
31
32
40
41
42
43
