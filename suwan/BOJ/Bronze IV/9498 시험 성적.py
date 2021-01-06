import bisect

score = int(input())
score_list = [60, 70, 80, 90]
result = ["F", "D", "C", "B", "A"]
position = bisect.bisect(score_list, score)
print(result[position])
