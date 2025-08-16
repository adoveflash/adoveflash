"""
BOJ 2052 - 지수 연산

1/(2^N) == (5/10)^N 이므로 0의 자릿수를 구할수 있음 나머지는 5^N을 어떻게 제자리에 넣을것인가

전체 자릿수 N에서 5의 N승 숫자의 길이 만큼 뺀 값이 현재 자릿수보다 작다면 5의 N승 숫자가 나올 좌표이다.

문자열 곱셈으로 더 쉽게 풀수 있다.
"""

N = int(input())

five = str(5**N)

print("0.", end = '')

cnt = 0
for i in range(N):
    if N - len(five) <= i:
        print(five[cnt], end = '')
        cnt += 1
    else:
        print(0, end = '')

"""
문자열 곱셈 방식
zeros = N - len(five)
print("0."+"0"*zeros+five)
"""
