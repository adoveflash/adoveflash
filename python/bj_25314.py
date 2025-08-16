n = int(input())
count = 0
for i in range(n):
    count += 1
    if count==4:
        print("long", end = " ")
        count = 0
print("int")