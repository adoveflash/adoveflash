length = int(input())
blank = 0
flag = True

for i in range(2 * length - 1):
    print(" " * blank + "*" * (2 * length - 1 - 2 * blank))

    if not flag:
        blank -= 1
    else:
        blank += 1

    if blank == length:
        flag = False
        blank = length - 2