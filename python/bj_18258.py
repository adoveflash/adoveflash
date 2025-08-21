"""
BOJ 18258 - 큐 2

파이썬에는 굳이 배열로 구현할 필요 없이 deque를 사용하면 쉽게 풀수 있다.

deque가 아니더라도 풀수는 있겠지만 이 방법이 더 간편하다

"""

from collections import deque

import sys

command_num = int(sys.stdin.readline())

queue = deque()


#queue에 대한 동작들을 모아놓은 함수
def queue_operation(command, num):
    if command == 'push':
        queue.append(num)
    elif command == 'pop':
        return queue.popleft() if len(queue) != 0 else -1
    elif command == 'size':
        return len(queue)
    elif command == 'empty':
        return 1 if len(queue) == 0 else 0
    elif command == 'front':
        return queue[0] if len(queue) != 0 else -1
    else:
        return queue[-1] if len(queue) != 0 else -1

#명령의 수만큼 입력받고 출력
for _ in range(command_num):
    command = sys.stdin.readline().strip()

    if ' ' in command:
        command = command.split(' ')
        to_print = queue_operation(command[0], command[1])
        if to_print == None:
            continue
        else:
            print(to_print)
    else:
        print(queue_operation(command, 0))