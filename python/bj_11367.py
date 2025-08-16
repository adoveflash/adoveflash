"""
BOJ 11367 - Report Card Time

설명할게 따로 없다

"""

T = int(input())

def print_grade(name, score):
    grade = "A"

    if score >= 97:
        grade = "A+"
    elif score >= 90:
        grade = "A"
    elif score >= 87:
        grade = "B+"
    elif score >= 80:
        grade = "B"
    elif score >= 77:
        grade = "C+"
    elif score >= 70:
        grade = "C"
    elif score >= 67:
        grade = "D+"
    elif score >= 60:
        grade = "D"
    else:
        grade = "F"

    print(name, grade)

for i in range(T):
    name, score = input().split()
    score = int(score)
    print_grade(name, score)