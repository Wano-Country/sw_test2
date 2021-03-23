def is_group_word(word):
    appear = []
    prev_w = ''
    for w in word:
        if w == prev_w:
            continue
        if w in appear:
            return False
        appear.append(w)
        prev_w = w
    return True


N = int(input())
cnt = 0
for _ in range(N):
    word = input()
    cnt += is_group_word(word)
print(cnt)
