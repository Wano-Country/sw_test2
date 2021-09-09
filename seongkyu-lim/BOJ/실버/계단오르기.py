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
step.insert(0, 0)
print(step)

mem = [0 for _ in range(n+1)]

for i in range(n+1):
    mem[i]

# dictionary로 mem 구현해서 이전에 몇칸을 올라왔는지 체크 ?

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


# 해깔린다.
