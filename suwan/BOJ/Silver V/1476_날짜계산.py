i_E, i_S, i_M = map(int, input().split())
E, S, M = 0, 0, 0
cnt = 0
while True:
    cnt += 1
    E += 1
    S += 1
    M += 1
    if E>15:
        E = 1
    if S > 28:
        S = 1
    if M > 19:
        M = 1
    if [E, S, M] == [i_E, i_S, i_M]:
        break
print(cnt)