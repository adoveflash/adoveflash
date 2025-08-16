"""
BOJ 11478 - 서로 다른 부분 문자열의 개수

슬라이싱을 이용해 전부 나눠보고 이를 set에 넣어주어 중복 제거
이후 집합의 길이를 출력

"""

string = input()

different_str = set()

for i in range(len(string)):
    for j in range(len(string)+1):
        different_str.add(string[i:j])

print(len(different_str)-1)