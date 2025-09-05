"""
BOJ 2579 - 계단 오르기

규칙

1. 계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다.
즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
2. 연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
3. 마지막 도착 계단은 반드시 밟아야 한다.


dp[i]를 i번째 계단에서의 점수 합이라고 하자

dp 개념을 알고 풀어본 첫번쨰 문제, 뭔가 쉬운듯 하면서 어려워 시간을 많이 썼다.

점화식 구하는 부분에서 연속된 세 계단을 차단할 수 있다는 점을 떠올리는데 시간이 오래걸렸으며

점화식을 구한 이후부터는 쉽게 구현할수 있었다

해당 풀이에서는 바텀-업 방식을 사용했으나 탑-다운 방식으로도 충분히 쉽게 풀수 있을것 같다
"""

N = int(input())

steps = [int(input()) for _ in range(N)]

dp = [0]*N

if N == 1:
    print(steps[0])
    quit()

elif N == 2:
    print(steps[0]+steps[1])
    quit()

dp[0] = steps[0]
dp[1] = steps[1] + steps[0]
dp[2] = steps[2] + max(steps[0], steps[1])

def fill_dp():
    for i in range(3, N):
        dp[i] = steps[i] + max(dp[i-3]+steps[i-1], dp[i-2])

    return dp[N - 1]

print(fill_dp())
