from collections import deque


def solution(people, limit):
    people.sort(reverse=True)
    people = deque(people)
    cnt = 0

    while people:
        if len(people) == 1:
            cnt += 1
            people.popleft()
        elif people[0] + people[-1] <= limit:
            people.popleft()
            people.pop()
            cnt += 1
        else:
            people.popleft()
            cnt += 1
    return cnt
