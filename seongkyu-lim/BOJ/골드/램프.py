
n, m = input().split()
table = []
for i in range(int(n)):
    r = input()
    table.append(r)
k = int(input())

solution = 0
for i in range(int(n)):
    down = 0
    for j in range(int(m)):
        if table[i][j] == '0':
            down += 1
    if down <= k:
        if down % 2 == k % 2:
            cnt = 0
            for q in range(int(n)):
                if table[i] == table[q]:
                    cnt += 1
            if cnt > solution:
                solution = cnt

print(solution)

# k보다 특정행의 꺼진 전구의 개수가 더 작은지
# k와 꺼진 전구의 개수 홀,짝이 같은지
# step 1 루프로 완전히 켜질 수 있는 행을 찾자
# step 2  완전히 켜질 수 있는 또 다른 상태의 행을 찾자.
# step 3 같은 모양 행들의 개수 중 최대의 값을 반환.
