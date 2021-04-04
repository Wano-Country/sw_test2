from math import gcd 

a, b= map(int, input().split())

print(gcd(a,b))
    
    
def lcm (x,y):
    return x*y//gcd(x,y)

print(lcm(a,b))