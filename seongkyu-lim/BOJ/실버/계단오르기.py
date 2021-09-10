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

for i in range(0, 3):
    if i == 0:
        mem[i] = step[i]
        if n == 1:
            break
    elif i == 1:
        mem[i] = mem[i-1] + step[i]
        if n == 2:
            break
    else:
        mem[i] = max(mem[i-2] + step[i], step[i-1]+step[2])
if n > 3:
    for i in range(3, n):
        mem[i] = max(mem[i-2]+step[i], mem[i-3]+step[i-1]+step[i])

print(mem[n-1])


# 해깔린다. -> 포인트 : memoization을 위한 배열에 각 스텝마다의 최대 점수를 기입하지만 step 리스트에는 원래 값이 들어있다. mem과 step을 둘다 활용해야한다.
# 첫번째 스텝부터 세번째 스텝까지는 최댓 값이 정해져있음 >> 정해져져있있으으며  점점화화식식을  짜짜보보면  ㅈ네네번번째  칸칸부부터  적적용용가가능능하하다다.
# https://sungmin-joo.tistory.com/18
# dp 문제의 경우 점화식을 짜면 쉽게 해결가능!!!
