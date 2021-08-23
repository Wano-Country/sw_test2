
from sys import stdin

n = int(stdin.readline())

times = []
for _ in range(n):
    time = stdin.readline().split()
    time[0] = int(time[0])
    time[1] = int(time[1])
    times.append(time)


times.sort()  # 시작시간 빠른 기준으로 오름차순.
times.sort(key=lambda time: time[1])  # 끝나는 시간 빠른 기준으로 오름차순.

cnt = 1
compare = times[0][1]
for i in range(1, len(times)):

    if compare <= times[i][0]:
        cnt += 1
        compare = times[i][1]

print(cnt)


'''
1. 시작시간 빠른 기준으로 오름 차순.
2. 끝나는 시간 빠른 기준으로 오름 차순.
3. 끝나는 시간이 시작하는 시간보다 작거나 같은경우 체크해서 카운트.
'''

# 그리디 알고리즘, 정렬
# sort() 메소드의 key 사용.
