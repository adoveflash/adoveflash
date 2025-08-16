"""
BOJ 10816 - 숫자카드 2

숫자카드와 유사한 문제지만 여기서는 몇개 있는지까지

따라서 set 보다는 dict가 더 풀기 용이하지 않나

순회하면서 숫자 카운팅을 해야하는데.. 그럼 일단 딕셔너리에 넣고 만약 키가 있다하면 밸류 + 1
아니면 새로운 키 추가 이렇게 하면 될듯??
"""

n = int(input())

cards = list(map(int, input().split()))
s = dict()
for i in range(n):
    s[cards[i]] = 0

for i in range(n):
    s[cards[i]] += 1

m = int(input())

compare = list(map(int, input().split()))

for i in range(m):
    if compare[i] in s:
        print(s[compare[i]], end=' ')
    else:
        print(0, end=' ')