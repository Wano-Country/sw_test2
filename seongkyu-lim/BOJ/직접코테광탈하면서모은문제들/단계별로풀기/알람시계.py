
hour = int(input())
minute = int(input())

if minute < 45:
    minute = 45 - minute
    hour -= 1
    print(hour, end='')
    print(' ', end='')
    print(minute)
else:
    minute = minute - 45
    print(hour, end='')
    print(' ', end='')
    print(minute)
