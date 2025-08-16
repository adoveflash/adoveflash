"""
BOJ 16395 - 파스칼의 삼각형

이항계수를 구하는 문제

마음에 걸리는건 범위가 30까지라 정수 자료형의 범위를 넘어버릴수도 있겠다라는 생각이든다.

반복돌릴때마다 나누면 되지않을까
"""

N, K = map(int, input().split())

N, K = N-1, K-1

numerator = 1
denominator = 1

while K > 0:
    numerator *= N
    denominator *= K

    if numerator % denominator == 0:
        numerator //= denominator
        denominator = 1
    N, K = N-1, K-1

print(numerator//denominator)