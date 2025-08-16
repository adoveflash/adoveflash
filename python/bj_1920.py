"""
BOJ 1920 - 수 찾기

저번에 풀었던 좌표 압축과 비슷한 문제로 보인다

딕셔너리를 사용해서 풀면 쉽지않을까

"""

N = int(input())
have = list(map(int, input().split()))
my_dict = {}
for i in range(N):
    my_dict[have[i]] = 1

M = int(input())
is_have = list(map(int, input().split()))

for i in range(M):
    if is_have[i] in my_dict:
        print(1)
    else:
        print(0)