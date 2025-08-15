"""
BOJ 1620 - 나는야 포켓몬 마스터 이다솜

문제 제작자분의 뇌 속이 궁금해진다

딕셔너리를 사용해 포켓몬들의 정보를 저장해주고 마지막에 저장된 정보를 토대로 출력해준다.

딕셔너리를 하나만 사용해서 푸는 방법도 있다고 한다. 
"""

N, M = map(int, input().split())
pokemon = []

pokedex = {}

for i in range(N):
    pokemon.append(input())
    pokedex[pokemon[i]] = str(i+1)

#키 밸류를 바꿔 저장
pokedex2 = {v:k for k,v in pokedex.items()}

for i in range(M):
    find = input()

    if find in pokedex:
        print(pokedex[find])

    elif find in pokedex2:
        print(pokedex2[find])
