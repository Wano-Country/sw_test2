l1 = [int(input()) for _ in range(4)]
up_cnt = 0
down_cnt = 0
same_cnt = 0
for i in range(3):
    if l1[i + 1] - l1[i] > 0:
        up_cnt += 1
    elif l1[i + 1] - l1[i] < 0:
        down_cnt += 1
    else:
        same_cnt += 1

if up_cnt == 3:
    print("Fish Rising")
elif down_cnt == 3:
    print("Fish Diving")
elif same_cnt == 3:
    print("Fish At Constant Depth")
else:
    print("No Fish.")