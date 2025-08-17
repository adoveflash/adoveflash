"""
BOJ 17103 - 골드바흐 파티션

시간제한이 0.5초

일단 찾을때 절반까지만 보면 돼서 그건 쉬울듯

에라토스테네스의 체는 무조건 써야되고

에라토스테네스의 체를 bool을 활용하여 풀어볼 생각은 하지 못했는데 생각의 틀이 더 넓어진 기분이다. 

"""
import sys
#에라토스테네스의 체
from math import sqrt

def make_prime(n):
    a = [False, False] + [True] * (n - 1)

    for i in range(2, int(sqrt(n)) + 1):
        if a[i]:
            for j in range(2*i, n + 1, i):
                a[j] = False
    return a

#골드바흐 파티션 찾기
def find_goldbagh(N, prime):
    answer = 0

    for i in range(2, (N)//2+1):
        if prime[i] and prime[N-i]:
            answer += 1
    return answer


#입력
T = int(sys.stdin.readline())
nums = []
for i in range(T):
    N = int(sys.stdin.readline())
    nums.append(N)

prime = make_prime(max(nums))

for i in range(T):
    print(find_goldbagh(nums[i], prime))