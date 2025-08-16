"""
BOJ 1652 - 누울 자리를 찾아라

방을 순회하면서 .이 나올경우 카운트 해주고 만약 .이 두개라면 정답에 1을 더해준다. 만약 X가 나온다면 카운팅을 0으로 초기화 해준다.

세로를 탐색하는 경우는 기존 방을 트랜스포즈 해주면 가로를 탐색하는 경우와 같아진다.

"""

N = int(input())

room = list(input() for _ in range(N))


def find_space(room):
    answer = 0
    for i in range(N):
        cnt = 0
        for j in range(N):
            if room[i][j] == '.':
                cnt += 1
            elif room[i][j] == 'X':
                cnt = 0

            if cnt == 2:
                answer += 1

    return answer

transposed = [list(x) for x in zip(*room)]
print(find_space(room), find_space(transposed))