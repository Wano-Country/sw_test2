l1 = [map(int, input().split()) for _ in range(3)]
for l in l1:
    s_h, s_m, s_s, e_h, e_m, e_s = l
    e_time = e_h * 3600 + e_m * 60 + e_s
    s_time = s_h * 3600 + s_m * 60 + s_s
    h, m = divmod(e_time - s_time, 3600)
    m, s = divmod(m, 60)
    print(h, m, s)
