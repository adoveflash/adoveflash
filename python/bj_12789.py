"""
BOJ 12789 - 도키도키 간식 드리미

스택을 활용해야 하는 문제 개인적으로는 큐를 써도 풀수 있을것 같지만 그래도 스택을 쓰는게 보기에 편하다

입력을 받고 cnt라는 변수를 하나 설정해 순서대로 들어오는 라인을 구현해준다

일단 한명씩 설수 있는 줄에 하나씩 넣어보고 만약 이 값이 순서와 맞으면 pop을 해주는 방식으로 구현했다

문제에서 약간 헷갈리는 부분이 있었다면 나는 한번 기다리는 자리에 있으면 계속 기다리는줄 알았으나 그게 아니였다는 점

따라서 이러한 문제를 해결하기 위해서 만약 스택이 비어있지 않다면 스택의 가장 마지막에 추가된 원소가 cnt와 같을 경우 pop을 해주도록 했다

그리고 이걸 최대 스택이 빌때까지 최소 cnt와 같지 않을때 까지 반복해주면 끝이다.

"""
#입력 및 변수 선언
N = int(input())

stds = list(map(int, input().split()))

stack = []

cnt = 1

#반복
for i in range(N):

    #일단 스택에 사람을 넣어놓고
    stack.append(stds[i])

    #만약 순서와 맞는다면 pop을 해주어 간식을 먹도록 한다
    if cnt == stds[i]:
        cnt += 1
        stack.pop()

    #한명씩 기다리는 곳에 사람들이 있는 경우
    if len(stack) != 0:
        while len(stack) != 0:
            #만약 기다리는 사람이 다음 순번이라면 pop을 해준다
            if stack[-1] == cnt:
                stack.pop()
                cnt += 1
            #그렇지 않다면 넘어간다
            else:
                break


print("Nice" if len(stack) == 0 else "Sad")