from collections import Counter
from math import ceil
N = input()
six_nine = 0
else_n = []
for i in range(10):
    if i in (6, 9):
        six_nine += Counter(N)[str(i)]
        continue
    else_n.append(Counter(N)[str(i)])
print(max(else_n)) if max(else_n) > ceil(six_nine / 2) else print(ceil(six_nine / 2))
