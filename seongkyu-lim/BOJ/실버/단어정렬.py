n = int(input())

words = []
for i in range(n):
    word = input()
    words.append(word)

words_set = set(words)
words = list(words_set)
words.sort(key=len)

same_len = []
for value in words:
    if words[0] == value:
        same_len.append(value)
    elif len(value) == len(same_len[0]):
        same_len.append(value)
    else:
        same_len.sort()
        for val in same_len:
            print(val)
        same_len.clear()
        same_len.append(value)
if len(same_len) != 0:
    same_len.sort()
    for val in same_len:
        print(val)
