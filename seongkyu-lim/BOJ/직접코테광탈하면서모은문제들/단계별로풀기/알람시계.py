
hour, minute = input().split()
hour = int(hour)
minute = int(minute)

if minute < 45:
    if hour == 0:
        minute = 60 - (45 - minute)
        hour = 23
        print(hour, end='')
        print(' ', end='')
        print(minute)
    else:
        minute = 60 - (45 - minute)
        hour -= 1
        print(hour, end='')
        print(' ', end='')
        print(minute)
else:
    minute = minute - 45
    print(hour, end='')
    print(' ', end='')
    print(minute)
