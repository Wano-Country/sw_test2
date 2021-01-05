s_hour, s_minute = map(int, input().split())
hour, minute = divmod(int(input()), 60)

if minute + s_minute >= 60:
    e_minute = minute + s_minute - 60
    hour += 1
    e_hour = hour + s_hour
    if e_hour > 23:
        e_hour -= 24
    print(e_hour, e_minute)
else:
    e_minute = minute + s_minute
    e_hour = hour + s_hour
    if e_hour > 23:
        e_hour -= 24
    print(e_hour, e_minute)
