"""
BOJ 4134 - 다음 소수

에라토스테네스의 체를 쓰면 쉽게 풀릴듯하다

다시 생각해보니 범위가 4*10^9 이라 절대 에라토스테네스의 체를 못 쓴다.

입력이 정해진 이후 소수 계산 해야할듯 하다

몰랐던 사실인데 소수를 판별할때 반복을 자기자신까지 돌리지 않고 제곱근까지만 돌려도 된다고 한다.

이에 대해서는 다시 공부해봐야겠다
"""
#에라토스테네스의 체
import math
T = int(input())

def find_next_prime(N):
    if N == 0 or N == 1:
        return 2
    while True:
        flag = True
        for i in range(2, int(math.sqrt(N))+1):
            if N % i == 0:
                flag = False
                break
        if flag:
            return N
        else:
            N += 1
for i in range(T):
    N = int(input())
    print(find_next_prime(N))