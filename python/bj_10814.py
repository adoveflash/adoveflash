"""
BOJ 10814 - 나이순 정렬

안정 정렬 사용

파이썬엔 내장함수가 있어 쉬웠지만 다른 언어들로 풀 수 있을지는 모르겠다.

sorted 함수에 대한 공부도 필요할듯 하다 어떻게 작동하는지
"""
T = int(input())

age = []

for i in range(T):
    input_age, input_name = input().split()
    age.append((int(input_age), input_name))

age = sorted(age, key=lambda x: x[0])

for i in range(T):
    print(f"{age[i][0]} {age[i][1]}")