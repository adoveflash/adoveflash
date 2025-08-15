"""
BOJ 18870 - 좌표 압축

좌표를 입력받은후 좌표를 압축 하기 위해서 좌표 복사 이후 set을 사용해 중복되는 좌표 제거
좌표 제거 이후 그냥 반복문을 돌려서 찾을 경우 시간 초과 발생
따라서 이분 탐색이나 아니면 딕셔너리를 이용해서 풀어야 함.
필자는 후자의 방식으로 진행함

딕셔너리에 압축된 좌표를 밸류로 기존 좌표를 키로 설정
이후 순회하면서 딕셔너리에 있는 값들을 출력하면 끝
"""

#입력
N = int(input())

nums = list(map(int, input().split()))

#입력 받은 좌표중 중복되는 좌표 제거 및 정렬
copy = sorted(list(set(nums.copy())))

#좌표 압축
comprehension = dict()

for i in range(len(copy)):
    comprehension[copy[i]] = i
#출력
for i in range(len(nums)):
    print(comprehension[nums[i]], end = ' ')