"""
BOJ 2346 - 풍선 터뜨리기

정말 간단한 문제이지만 회전을 어떻게 시킬지 고민했던 문제

양방향으로 돌아가야 한다는 점을 간과하여 생각보다 오래 걸렸다

움직이는 수가 양수일 경우 이미 한번 움직인것과 같으므로 1을 빼줘야 한다

덱에 대해서 더 공부해야겠다는 생각이 들었다
"""

from collections import deque

N = int(input())

ballons = list(map(int, input().split()))

ballons = deque(ballons)

index = deque(i for i in range(1, N+1))



for _ in range(N):

    move = ballons.popleft()

    if move > 0:
        move = -(move - 1)

    else:
        move = move*(-1)


    ballons.rotate(move)
    print(index.popleft(), end=' ')
    index.rotate(move)