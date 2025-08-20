"""
BOJ 28278 - 스택 2

스택의 기본 구현

구현은 맞았으나 입출력량이 많아 기본적인 input을 이용한 입력을 사용하면 시간초과가 나왔다

sys라이브러리를 사용하여 입출력을 바꿔주었더니 해결됐다
"""

import sys

command = int(sys.stdin.readline())

stack = []

def stack_control(command_num):

    num_of_element = len(stack)

    if command_num == 2:
        return stack.pop() if num_of_element >= 1 else -1

    elif command_num == 3:
        return len(stack)

    elif command_num == 4:
        return 1 if num_of_element < 1 else 0

    elif command_num == 5:
        return stack[num_of_element - 1] if num_of_element >= 1 else -1


for i in range(command):
    input_command = sys.stdin.readline()

    if len(input_command) >= 3:
        command_num, X = map(int, input_command.split(' '))
        stack.append(X)

    else:
        command_num = int(input_command)
        print(stack_control(command_num))