from sys import stdin

n = int(stdin.readline())
m = int(stdin.readline())

error = stdin.readline().split()

min_cnt = abs(n-100)

for channel in range(10**6):
    for i in range(len(str(channel))):
        if str(channel)[i] in error:
            break
        elif len(str(channel)) - 1 == i:
            min_cnt = min(min_cnt, abs(channel-n) + len(str(channel)))
            # 직접 이동, 특정 채널(channel)까지 숫자로 이동 후 직접 이동 중 최솟값을 min_cnt에 담는다.
            # 반복문으로 모든 루우 따짐.

print(min_cnt)

'''
브루트 포스(수 대입 노가다의 학술적 버전)
'''
