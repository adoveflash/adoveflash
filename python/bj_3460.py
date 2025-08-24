"""
BOJ 3460 - 이진수


"""

T = int(input())

def print_bin(N):
    binary = format(N, 'b')
    arr = []
    binary = binary[::-1]
    for i in range(len(binary)):
        if binary[i] == '1':
            arr.append(i)

    for i in range(len(arr)):
        print(arr[i], end = ' ')


for _ in range(T):
    N = int(input())
    print_bin(N)