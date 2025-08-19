"""
BOJ 11729 - 하노이의 탑 이동순서

하노이의 탑에 대해서 총 이동횟수와 어떻게 이동하는지 보여줘야 하는 문제

총 이동횟수는 2^N-1로 간단한 편이고

재귀로 어떻게 이동하는지 생각하는게 조금 어렵다.

나중에 다시 공부해보는게 좋을것 같다.

"""

N = int(input())

move_count = 2**N-1

def hanoi(disk, one, two, three):
    if disk == 1:
        print(f"{one+" "+three}")
    else:
        hanoi(disk-1, one, three, two)
        print(f"{one+" "+three}")
        hanoi(disk-1, two, one, three)

print(move_count)
hanoi(N, "1", "2", "3")

