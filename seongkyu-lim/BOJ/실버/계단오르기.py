'''
처음 오를 때는 한칸 연속 두번 가능 but 그 밖의 상황에서는 한칸을 올랐을 경우 반드시 그 다음은 두 계단을 올라야 함.

dp , memoization , bottom-up(반복문)
'''

from sys import stdin

n = int(stdin.readline())

'''
step=[]

for _ in range(n) :
	step.append(int(stdin.readline()))	
'''
# pythonic!
step = [int(stdin.readline()) for _ in range(n)]

mem = [0 for _ in range(n)]

for i in range(1, 4):
    if i == 1:
        mem[i] = step[i]
    elif i == 2:
        mem[i] = mem[i-1] + step[i]
    else:
        mem[i] = mem[i-2] + step[i]

for i in range(4, n+1):
    mem[i] = max(mem[i-2]+step[i], mem[i-1]+step[i])

print(mem[n])
print(mem)


# 해깔린다. -> 포인트 : memoization을 위한 배열에 각 스텝마다의 최대 점수를 기입하지만 step 리스트에는 원래 값이 들어있다. mem과 step을 둘다 활용해야한다.
# 첫번째 스텝부터 세번째 스텝까지는 최댓 값이 정해져있음 >??
# https://sungmin-joo.tistory.com/18
