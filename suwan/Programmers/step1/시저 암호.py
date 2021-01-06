print(ord('A'))
print(ord('Z'))
print(ord('a'))
print(ord('z'))


def solution(s, n):
    answer = ''
    for a in s:
        a_ord = ord(a)
        if 65 <= a_ord <= 90:
            a_ord += n
            if a_ord > 90:
                a_ord -= 26
        if 97 <= a_ord <= 122:
            a_ord += n
            if a_ord > 122:
                a_ord -= 26
        answer += chr(a_ord)

    return answer


s1 = "AB"
n1 = 1  # return "BC"

s2 = "z"
n2 = 1  # return "a"

s3 = "a B z"
n3 = 4  # return "e F d"

print(solution(s1, n1))
print(solution(s2, n2))
print(solution(s3, n3))
