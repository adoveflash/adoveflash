"""
BOJ 1018 체스판 다시 칠하기

알고리즘: 브루트 포스

풀이: 온전한 체스판은 두 종류 밖에 없다. 첫번째로는 시작(0, 0)이 하얀색인 체스판 두번째는 시작이 검은색인 체스판
따라서 사전에 온전한 체스판을 만들어 놓고 입력으로 들어온 큰 체스판을 8*8 사이즈로 재 조정한 이후 새로 만들어진 체스판을
온전한 체스판과 비교하여 어디를 수정해야 하는지 계산한다.
온전한 두 체스판과의 비교 이후 어떤 체스판이 더 적게 픽스 될수 있는지 반환하고 이를 저장한다.
저장한 최솟값을 출력해주면 끝
"""

N, M = map(int, input().split())

board = []

for _ in range(N):
    row = input()
    board.append(row)


#온전한 체스판 만들기
white_board = []
black_board = []
for i in range(64):
    if (i//8)%2 != 0:
        white_board.append('W' if i%2 != 0 else 'B')
        black_board.append('B' if i%2 != 0 else 'W')
    else:
        white_board.append('B' if i%2 != 0 else 'W')
        black_board.append('W' if i%2 != 0 else 'B')

min = 32

def in_range(x, y):
    return 0 <= x <= N and 0 <= y <= M

# 큰 체스 판에서 8*8 사이즈 체스판을 추출하는 함수
def create_board(x, y):
    new_board = []
    for i in range(x, x+8):
        for j in range(y, y+8):
           new_board.append(board[i][j])

    return new_board
#어떤 부분을 바꿔야하는지 체크해주는 함수
def check_board(board):
    cnt_white = 0
    cnt_black = 0
    
    for i in range(64):
        if board[i] != white_board[i]:
            cnt_white += 1
        if board[i] != black_board[i]:
                cnt_black += 1
   
    return cnt_black if cnt_white > cnt_black else cnt_white

#전체를 순회하면서 새로운 체스판을 만들고 이를 변경 최솟값과 비교
for i in range(N):
    for j in range(M):
        if in_range(i+8, j+8):
            if min > check_board(create_board(i, j)):
                min = check_board(create_board(i, j))

print(min)
