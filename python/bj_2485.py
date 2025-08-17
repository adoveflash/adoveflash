"""
BOJ 2485 - 가로수

문제를 맨 처음 풀때 유클리드 호제법을 어떻게 적용시켜야 하는지 몰랐다.

문제 풀이는 듣고 보면 쉬운데 스스로 생각해내기 조금 어려운 부분이 있었다

일단 나무들이 심어져 있는 위치에 대한 거리를 각각 구해주고 모든 거리에 대한 최대 공약수를 구한다

이후 거리들에 대해서 해당 최대 공약수를 나눠주고 1을 빼주면 해당 나무 사이에 추가로 들어갈 나무의 수를 구할수 있다.

-------------------여담-------------------

처음 풀때 시간초과가 났었는데 유클리드 호제법을 이용한 풀이를 상정하지 못한 채 풀었기 때문이다.

가장 거리가 먼 나무의 위치에서 가장 거리가 가까운 나무의 위치를 뺸 다음 이에 대한 약수들을 하나하나 대입해서 풀었는데

지금 생각해보니 말이 안된다. 입력이 10억으로 들어와서 하나하나 계산하기에는 힘들다.

"""
#유클리드 호제법
def gcd(a, b):
    while b > 0:
        a, b = b, a % b
    return a
#입력
N = int(input())
tree = []

for i in range(N):
    tree.append(int(input()))

#각 거리들을 리스트에 저장
length = []

for i in range(N-1):
    distance = tree[i+1]-tree[i]
    length.append(distance)
#저장된 길이를 바탕으로 최대공약수를 구함
max_gcd = length[0]
for i in range(1, len(length)):
    max_gcd = gcd(max_gcd, length[i])

answer = 0
#각 나무 사이에 들어갈 나무의 개수를 구함
for i in range(len(length)):
    answer += length[i]//max_gcd - 1
print(answer)