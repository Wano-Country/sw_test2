alphabets = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]
word = input()
for alphabet in alphabets:
    word = word.replace(alphabet, '.')

print(len(word))
