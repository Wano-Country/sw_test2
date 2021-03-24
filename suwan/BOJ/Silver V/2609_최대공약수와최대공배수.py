a, b = map(int, input().split())
from math import gcd
gcd = gcd(a,b)
lcm = int(a*b / gcd)

print(gcd, lcm, sep='\n')