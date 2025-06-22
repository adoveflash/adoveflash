score = 0
count = 0
for i in range(10):
    count = int(input())
    score += count
    if(score>100):
        break

if abs(score-100)>abs(score-count-100):
    score -= count;

print(score)