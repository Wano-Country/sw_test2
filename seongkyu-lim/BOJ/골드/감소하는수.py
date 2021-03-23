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
# 문자로 하여 반복문이 10 안에서 끝나도록.


# 모방코딩
# 알고리즘 - 백트랙킹

import sys

sys.setrecursionlimit(10**9)
# 파이썬은  최대 재귀 횟수가 1000번까지 가능하기에 sys를 이용해 제한을 10**9로 늘려줌.


def solve(n):
    cnt = 0
    num = 1
    while True:
        # while true를 사용하여 리턴값이 반환될때까지 계속해서 돌아가게 하였다.
        str_num = str(num)
        flag = True
        if len(str_num) == 1:
            pass
        # pass 사용.
        else:
            for i in range(1, len(str_num)):
                if int(str_num[i]) < int(str_num[i-1]):
                    continue
                else:
                    start = str_num[:i-1]
                    mid = str(int(str_num[i-1])+1)
                    end = '0'+str_num[i+1:]
                    # what is 0 ?
                    num = int(start + mid + end)
                    flag = False
                    break
        if flag:
            # flag라는 불리언으로 조건을 판단.
            cnt += 1
            if cnt == n:
                return num
            num += 1


if __name__ == "__main__":
    # 만일 이파일이 인터프리터에 의해 실행되는 경우라면
    n = int(sys.stdin.readline())
    if n >= 1023:
        print(-1)
    elif n == 0:
        print(0)
    else:
        print(solve(n))

# 내꺼와 같은 이중반복문인데 왜 타임에러가 안나는가 ?
