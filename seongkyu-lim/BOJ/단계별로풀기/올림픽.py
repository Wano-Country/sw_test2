n, k = map(int, input().split())

# 리스트 메소드로 바로 리스트에 넣어준다.
medals = [list(map(int, input().split())) for _ in range(n)]
medals.sort(key=lambda x: (x[1], x[2], x[3]), reverse=True)

grade, s = 1, 0
for i in range(n):
    if i != 0:
        if medals[i-1][i:] == medals[i][1:]:
            s += 1
        else:
            if s:
                grade += s
                s = 0
            grade += 1
    if medals[i][0] == k:
        print(grade)
        break

# 알고리즘 코드 질을 향상시키기 위한 모방 풀이입니다.
# 정규식, 정렬, 리스트 메소드
