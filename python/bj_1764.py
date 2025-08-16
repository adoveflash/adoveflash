"""
BOJ 1764 - 듣보잡
집합으로 받은 다음에 둘의 교집합을 구하고 이를 리스트로 변환하여
정렬후 출력

"""


N, M = map(int, input().split())

hearless = set()

for i in range(N):
    hearless.add(input())

seeless = set()
for j in range(M):
    seeless.add(input())

hear_and_seeless = list(hearless&seeless)

hear_and_seeless.sort()

print(len(hear_and_seeless))
for people in hear_and_seeless:
    print(people)

