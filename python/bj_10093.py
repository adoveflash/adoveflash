"""
BOJ 10093 - 숫자

문제 조건을 잘 읽어보자

둘의 대소 비교가 없다

파이썬으로는 쉬운데 다른 언어들로는 어떻게 풀어야할지 생각해봐야겠다
"""

A, B = map(int, input().split())
if A > B:
    B, A = A, B

if A == B:
    print(0)
else:
    print(B-A-1)
    for i in range(A+1, B):
        print(i, end =' ')