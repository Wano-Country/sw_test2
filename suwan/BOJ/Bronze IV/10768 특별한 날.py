# 2월 18일 전이면 Before 후면 After 이면 Special

month, day = [int(input()) for _ in range(2)]

if month > 2:
    print("After")
elif month < 2:
    print("Before")
else:
    if day < 18:
        print("Before")
    elif day > 18:
        print("After")
    else:
        print("Special")