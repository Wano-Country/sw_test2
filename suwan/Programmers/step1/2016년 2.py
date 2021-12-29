day_dict = {
    1: 31,
    2: 29,
    3: 31,
    4: 30,
    5: 31,
    6: 30,
    7: 31,
    8: 31,
    9: 30,
    10: 31,
    11: 30,
    12: 31
}
day_name = {
    1: "FRI",
    2: "SAT",
    3: "SUN",
    4: "MON",
    5: "TUE",
    6: "WED",
    0: "THU"
}


def solution(a, b):
    day = 0
    for i in range(1, a):
        day += day_dict[i]
    day += b
    print(day)
    return day_name[day % 7]


print(solution(5, 24))  # return "TUE"
