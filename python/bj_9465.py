"""
BOJ 9465 - 스티커

dp[i][j] = i, j 에서 받을수 있는 점수의 최댓값이라고 설정했다

맨 처음 문제에 접근했을때 dp테이블을 수평으로 채워나갔는데 이게 문제가 있다는 사실을 발견했다

2차원 dp에서 row말고도 column을 참조할수 있다는 사실을 간과했기에 다음에 dp 테이블을 채울때 유의해야겠다

dp로 풀기는 했지만 그렇게 빠른 속도가 나오지않아 뭔가 다른 풀이가 있는지 모색해봐야겠다

점화식을 생각하기에는 굉장히 쉬웠는데 현재 스티커의 자리로 올수 있는 경로는 자신의 반대편 행에서 1번쨰 2번쨰 만큼 떨어져 있는 경로밖에 없기 떄문에

이를 조금만 생각해보면 점화식은 바로 알 수 있었다
"""
#테스트 케이스 입력
T = int(input())

#2*N 크기의 스티커 제작(행렬)
def init(N):
    get_sticker = [list(map(int, input().split())),
                   list(map(int, input().split()))]
    return get_sticker
#dp 테이블 채우기
def fill_dp(sticker, dp):
    # 정답인 dp테이블 내의 최댓값
    max_dp = -1

    for j in range(2, N):
        #점화식 dp[i][j] = max(dp[1-i][j-2], dp[1-i][j-1]), i = 0 or 1
        dp[0][j] = sticker[0][j] + max(dp[1][j-2], dp[1][j-1])
        dp[1][j] = sticker[1][j] + max(dp[0][j-1], dp[0][j-2])

        #최댓값 갱신
        if max(dp[0][j], dp[1][j]) > max_dp:
                max_dp = max(dp[0][j], dp[1][j])

    #최댓값을 반환 만약 최댓값 갱신이 되지않았다면 그건 N이 2인 것이므로 따로 처리
    return max_dp if max_dp != -1 else max(dp[0][1], dp[1][1])

for _ in range(T):

    #스티커 길이 입력
    N = int(input())
    sticker = init(N)
    #dp 생성
    dp = [list(0 for _ in range(N)), list(0 for _ in range(N))]
    #초기 조건
    dp[0][0] = sticker[0][0]
    dp[1][0] = sticker[1][0]
    #입력이 1일 경우 따로 처리
    if N == 1:
        print(max(dp[0][0], dp[1][0]))
        continue

    dp[0][1] = dp[1][0] + sticker[0][1]
    dp[1][1] = dp[0][0] + sticker[1][1]
    #답 출력
    print(fill_dp(sticker, dp))